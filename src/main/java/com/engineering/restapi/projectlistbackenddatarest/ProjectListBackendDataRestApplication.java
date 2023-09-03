package com.engineering.restapi.projectlistbackenddatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.engineering.restapi.projectlistbackenddatarest")
@EnableMongoAuditing
public class ProjectListBackendDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectListBackendDataRestApplication.class, args);
	}

}


// token : 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