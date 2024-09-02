package com.ms.schoolms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SchoolmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmsApplication.class, args);
	}

}
