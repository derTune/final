package com.example.postCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CounterController {
    @Autowired
    private CounterService counterService;

    @GetMapping("/counter")
    public Integer getCount() {
        return counterService.getCount();
    }

    @PostMapping("/counter")
    public String increment() {
        counterService.save();
        return "+1 more request";
    }

    @GetMapping("/report")
    public List<OutputModel> getAll() {
        return counterService.getAll();
    }
}
