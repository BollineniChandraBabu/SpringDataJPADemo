package com.example.springdatajpademo.service.impl;

import com.example.springdatajpademo.dao.CurriculaJPA;
import com.example.springdatajpademo.dao.MyEntityRepositoryCustom;
import com.example.springdatajpademo.modal.Curriculum;
import com.example.springdatajpademo.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumServiceImpl implements CurriculumService {
    @Autowired
    MyEntityRepositoryCustom myEntityRepositoryCustom;

    @Autowired
    CurriculaJPA curriculaJPA;

    @Override
    public List<Curriculum> getCurriculumUsingEntityManager() {
        getCurriculumByJPAList();
        myEntityRepositoryCustom.getCurriculumUsingEntityManagerNative();
        return myEntityRepositoryCustom.getCurriculumUsingEntityManager();
    }

    @Override
    public List<Curriculum> getCurriculumByJPAList() {
        return curriculaJPA.findAll();
    }
}
