package com.example.springdatajpademo.dao;

import com.example.springdatajpademo.modal.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculaJPA extends JpaRepository<Curriculum,Long> {


}
