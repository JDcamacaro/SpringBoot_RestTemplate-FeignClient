package com.jdcamacaro.microservicio_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableZuulproxy
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioZuulApplication.class, args);
	}

}
