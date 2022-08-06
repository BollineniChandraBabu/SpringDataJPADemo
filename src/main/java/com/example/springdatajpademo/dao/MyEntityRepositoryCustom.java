package com.example.springdatajpademo.dao;

import com.example.springdatajpademo.modal.Curriculum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyEntityRepositoryCustom {
    List<Curriculum> getCurriculumUsingEntityManager();

    List<Curriculum> getCurriculumUsingEntityManagerNative();
}
