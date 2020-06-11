package com.rahul.covid19api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Covid19ApiApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Covid19ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
