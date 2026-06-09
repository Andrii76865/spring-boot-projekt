package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello from Spring Boot",
                "team", "Andrii Umanets",
                "indexes", List.of("76865"),
                "status", "public endpoint works"
        );
    }

    @GetMapping("/api/test")
    public Map<String, Object> test() {
        return Map.of(
                "application", "hello-springboot-andrii-76865",
                "author", "Andrii Umanets",
                "index", "76865",
                "time", LocalDateTime.now().toString(),
                "result", "OK"
        );
    }
}
