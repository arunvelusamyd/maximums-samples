package com.flexy;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHazelcastApplication.class, args);
	}

	@Bean(destroyMethod = "shutdown")
	public HazelcastInstance createStorageNode() throws Exception {
		return Hazelcast.newHazelcastInstance(new Config("hazelcast-sample-service"));
	}

}
