package com.flexy;

import io.crnk.spring.boot.v3.CrnkConfigV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@SpringBootApplication
@Import({ CrnkConfigV3.class})
public class SpringBootKatharsisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKatharsisApplication.class, args);
	}
}
