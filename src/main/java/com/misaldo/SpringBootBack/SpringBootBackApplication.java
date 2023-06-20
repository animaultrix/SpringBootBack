package com.misaldo.SpringBootBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.misaldo.SpringBootBack.models.entity")
@EnableJpaRepositories("com.misaldo.SpringBootBack.models.dao")
public class SpringBootBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackApplication.class, args);
	}

}
