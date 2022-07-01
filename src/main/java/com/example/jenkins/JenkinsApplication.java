package com.example.jenkins;

import com.example.jenkins.core.config.TilesConfig;
import com.example.jenkins.core.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
		TilesConfig.class,
		WebConfig.class
})
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
