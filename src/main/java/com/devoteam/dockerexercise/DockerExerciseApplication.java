package com.devoteam.dockerexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DockerExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExerciseApplication.class, args);
	}

}
