package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
//@Import({ CrnkConfigV3.class})
public class SpringBootKatharsisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKatharsisApplication.class, args);
	}
}
