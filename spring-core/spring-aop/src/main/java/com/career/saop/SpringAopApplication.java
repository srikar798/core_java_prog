package com.career.saop;

import com.career.saop.service.MathService;
import com.career.saop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringAopApplication {

	private  final MathService mathService;
	private final UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
			//mathService.generatePrimeNumbers(100000,1000000000);

			System.out.println(userService.getUserDetails());
		};
	}
}
