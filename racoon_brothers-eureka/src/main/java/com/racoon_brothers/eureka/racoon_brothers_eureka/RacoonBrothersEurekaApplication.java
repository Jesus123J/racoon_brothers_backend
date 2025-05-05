package com.racoon_brothers.eureka.racoon_brothers_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RacoonBrothersEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RacoonBrothersEurekaApplication.class, args);
	}

}
