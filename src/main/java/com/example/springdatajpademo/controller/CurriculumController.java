package com.example.springdatajpademo.controller;

import com.example.springdatajpademo.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurriculumController {

    @Autowired
    CurriculumService curriculumService;

    @GetMapping
    public ResponseEntity<?> getCurricula(){
        return  new ResponseEntity<>(curriculumService.getCurriculumUsingEntityManager(), HttpStatus.ACCEPTED);
    }
}
