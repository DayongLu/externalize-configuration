package com.paradyme.cna.externalizeconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ExternalizeConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalizeConfigurationApplication.class, args);
	}
}


@RestController
class UserController{


	private String userName;

	UserController( @Value("${username}") String userName) {
		this.userName = userName;
	}

	@GetMapping(value = "/user")
	public String getUserName(){
		return userName;
	}

}
