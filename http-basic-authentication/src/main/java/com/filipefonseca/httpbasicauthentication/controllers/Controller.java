package com.filipefonseca.httpbasicauthentication.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hello world!");
    }
}
