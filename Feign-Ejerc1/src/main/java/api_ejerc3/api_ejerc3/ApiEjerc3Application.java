package api_ejerc3.api_ejerc3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiEjerc3Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiEjerc3Application.class, args);
	}

}
