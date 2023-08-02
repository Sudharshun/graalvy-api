package com.sudharshun.graalvm.architecture.controllers;

import com.sudharshun.graalvm.architecture.service.GraalvyApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GraalvyController {

    GraalvyApiService graalvyApiService;

    public GraalvyController(GraalvyApiService graalvyApiService){
        this.graalvyApiService = graalvyApiService;
    }


    @GetMapping("/pythonifyme/{content}")
    Optional<String> pythonifyme(@PathVariable String content) {
        System.out.println("===>"+this.graalvyApiService.dosomething(content));
        return Optional.of(content.toUpperCase());
    }
}