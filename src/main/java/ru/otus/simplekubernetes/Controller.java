package ru.otus.simplekubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    public Health getHealth() {
        return new Health();
    }
}
