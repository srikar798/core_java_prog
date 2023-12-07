package com.career.sc;

import com.career.sc.domain.AppUser;
import com.career.sc.domain.Course;
import com.career.sc.domain.CreditDetails;
import com.career.sc.repo.AppUserRepo;
import com.career.sc.repo.CourseRepo;
import com.career.sc.repo.CreditDetailsRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentCourseApplication {

	private final AppUserRepo appUserRepo;
	private final CourseRepo courseRepo;
	private final CreditDetailsRepo creditDetailsRepo;


	public static void main(String[] args) {
		SpringApplication.run(StudentCourseApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(){
		return args -> {
			//createCreditsForAllUsers();
			//addCourseToUser(1,4);
			addCourseToUser(3,2);
		};
	}

	@Transactional
	private void createCreditsForAllUsers() {
		List<AppUser> userList = appUserRepo.findAll();
		for(AppUser appUser: userList){
			CreditDetails creditDetails = new CreditDetails();
			creditDetails.setAppUser(appUser);
			creditDetails.setAmount(10);
			creditDetailsRepo.save(creditDetails);

		}
	}
@Transactional
	public void addCourseToUser(long userId, long courseId){
		AppUser appUser = appUserRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found with id :" + userId));
		Course course = courseRepo.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found with id :" + appUser));
		CreditDetails creditDetails = appUser.getCreditDetails();
		appUser.addCourse(course);
		if(creditDetails != null){
			double fee = course.getFee();
			double credit = creditDetails.getAmount();
			if(credit >= fee){
				creditDetails.setAmount(credit -fee);
				System.out.println("Course added successfully");
			}else{
				double remaining = fee - credit;
				creditDetails.setAmount(0);
				System.out.println("Please pay remaining amount :" + remaining);
			}
			creditDetailsRepo.save(creditDetails);
		}else {
			System.out.println("Please pay the course amount " +course.getFee() );
		}
		appUserRepo.save(appUser);
	}

}
