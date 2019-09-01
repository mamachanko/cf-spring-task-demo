package io.github.mamachanko.taskdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Collections.singletonMap;

@RestController("/api")
public class Api {

    @GetMapping
    public Map<String, Object> getStuff() {
        return singletonMap("hello", "there");
    }
}
