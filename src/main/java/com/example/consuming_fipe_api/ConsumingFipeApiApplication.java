package com.example.consuming_fipe_api;

import com.example.consuming_fipe_api.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumingFipeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingFipeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();

		principal.showMenu();
	}
}
