package com.flexy;

import com.hazelcast.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableEurekaClient
public class SpringBootHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHazelcastApplication.class, args);
	}

	@Bean
	public Config hazelcastConfig() {
		Config config = new Config();
		config.setInstanceName("hazelcast-sample-1");
		config.getNetworkConfig().setPort(5701);
		config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
		config.getNetworkConfig().getJoin().getEurekaConfig()
				.setEnabled(true)
				.setProperty("self-registration", "true")
				.setProperty("namespace", "hazelcast");
		return config;
	}

}
