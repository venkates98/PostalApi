package com.PostalApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PostalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostalApiApplication.class, args);
	}

	@Bean
	public RestTemplate rst() {
		return new RestTemplate();
	}

}
