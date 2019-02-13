package com.flexy;

import com.hazelcast.config.Config;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import io.katharsis.spring.boot.v3.KatharsisConfigV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@SpringBootApplication
@Import({
		KatharsisConfigV3.class,
		})
public class SpringBootKatharsisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKatharsisApplication.class, args);
	}

	/*@Bean(destroyMethod = "shutdown")
	public HazelcastInstance createStorageNode() throws Exception {
		return Hazelcast.newHazelcastInstance(new Config().setGroupConfig(new GroupConfig("employee-service")));
	}*/


}
