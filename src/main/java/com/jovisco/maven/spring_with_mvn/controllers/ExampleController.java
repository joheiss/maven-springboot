package com.jovisco.maven.spring_with_mvn.controllers;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public Map<String, Object> getValues() {
        var values = new HashMap<String, Object>();
        values.put("greeting", "Hi");
        values.put("name", "Josef");
        return values;
    }
}
