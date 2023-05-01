package com.example.filmsservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage/health")
public class HealthController {
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public void manageHealth() {
    }
}
