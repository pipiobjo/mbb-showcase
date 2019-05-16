package com.prodyna.mbb.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableNeo4jRepositories
@EnableTransactionManagement
public class ScApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScApplication.class, args);
	}

}
