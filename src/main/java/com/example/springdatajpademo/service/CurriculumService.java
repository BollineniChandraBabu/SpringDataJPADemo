package com.example.springdatajpademo.service;

import com.example.springdatajpademo.modal.Curriculum;

import java.util.List;

public interface CurriculumService {

    List<Curriculum> getCurriculumUsingEntityManager();

    List<Curriculum> getCurriculumByJPAList();
}
