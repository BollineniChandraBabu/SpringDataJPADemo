package com.example.springdatajpademo.controller;

import com.example.springdatajpademo.modal.Curriculum;
import com.example.springdatajpademo.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurriculumController {

    @Autowired
    CurriculumService curriculumService;

    @GetMapping
    public ResponseEntity<?> getCurricula(){
        return  new ResponseEntity<>(curriculumService.getCurriculumUsingEntityManager(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createCurricula(@RequestBody Curriculum curriculum){
        return  new ResponseEntity<>(curriculumService.insertCurriculum(curriculum), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateCurricula(@RequestBody Curriculum curriculum){
        return  new ResponseEntity<>(curriculumService.updateCurriculum(curriculum), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getCurriculaById(@PathVariable Long id){
        return  new ResponseEntity<>(curriculumService.getCurriculumById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteCurricula(@PathVariable Long id){
        curriculumService.deleteCurriculumById(id);
        return  new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCurricula(@RequestBody Curriculum curriculum){
        curriculumService.deleteCurriculum(curriculum);
        return  new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
