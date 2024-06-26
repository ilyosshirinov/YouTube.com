package com.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/api")
@Tag(name = "Auth Controller", description = "Api list for authorization, registration and other ... ")
public class Test {


    @GetMapping("/test")
    @Operation(summary = "Test", description = "Api for test")
    public ResponseEntity<?> test(){
        log.info(LocalDateTime.now().toString());
        return ResponseEntity.ok("YouTube run");
    }
}
