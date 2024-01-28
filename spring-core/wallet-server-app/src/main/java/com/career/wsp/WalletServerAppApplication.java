package com.career.wsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WalletServerAppApplication implements CommandLineRunner {

	@Value("${app.custom.message:Wallet Server App}")
	private String message;
	public static void main(String[] args) {
		SpringApplication.run(WalletServerAppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info(message);

	}
}
