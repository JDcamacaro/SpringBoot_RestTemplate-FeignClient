package com.jdcamacaro.microservicio-eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicioEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEurekaApplication.class, args);
	}

}
