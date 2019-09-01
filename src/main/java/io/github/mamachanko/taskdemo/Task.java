package io.github.mamachanko.taskdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.Instant;

@Profile("task")
@SpringBootApplication
@Slf4j
public class Task {

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            log.info("running at {}", Instant.now());
        };
    }

}
