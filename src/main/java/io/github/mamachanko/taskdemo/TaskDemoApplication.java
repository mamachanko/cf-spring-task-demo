package io.github.mamachanko.taskdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class TaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TaskDemoApplication.class);

		configureApp(application).run(args);
    }

	private static SpringApplication configureApp(SpringApplication application) {
		String activeProfiles = System.getProperty("spring.profiles.active");
		System.out.println("spring.profiles.active: " + activeProfiles);
		if (activeProfiles != null && activeProfiles.toLowerCase().contains("task")) {
			System.out.println("Not including web context.");
			application.setWebApplicationType(WebApplicationType.NONE);
		}
		return application;
	}
}
