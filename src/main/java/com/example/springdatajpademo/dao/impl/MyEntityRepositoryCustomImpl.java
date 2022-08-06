package com.example.springdatajpademo.dao.impl;

import com.example.springdatajpademo.dao.MyEntityRepositoryCustom;
import com.example.springdatajpademo.modal.Curriculum;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MyEntityRepositoryCustomImpl implements MyEntityRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Curriculum> getCurriculumUsingEntityManager() {
        return entityManager.createQuery("select c from Curriculum c").getResultList();
    }

    @Override
    public List<Curriculum> getCurriculumUsingEntityManagerNative() {
        return entityManager.createNativeQuery("select * from curricula",Curriculum.class).getResultList();
    }
}
