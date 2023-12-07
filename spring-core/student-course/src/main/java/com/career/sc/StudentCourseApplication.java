package com.career.sc;

import com.career.sc.domain.AppUser;
import com.career.sc.repo.AppUserRepo;
import com.career.sc.repo.CourseRepo;
import com.career.sc.repo.CreditDetailsRepo;
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
			List<AppUser> userList = appUserRepo.findAll();
			for(AppUser appUser: userList){
				System.out.println(appUser.getUsername());
			}
		};
	}

}
