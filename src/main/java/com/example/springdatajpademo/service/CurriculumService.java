package com.example.springdatajpademo.service;

import com.example.springdatajpademo.modal.Curriculum;

import java.util.List;

/**
*The interface class for the Curriculum.It has list of method declaration by business which will
*manage business layer logic.
 * @author ChandraBabuBollineni
 */
public interface CurriculumService {

    /**
     * Get all curriculum details using Entity manager
     * @return {@link List} of {@link Curriculum}
     */
    List<Curriculum> getCurriculumUsingEntityManager();

    /**
     * Get all curriculum details using JPA Repository
     * @return {@link List} of {@link Curriculum}
     */
    List<Curriculum> getCurriculumByJPAList();

    /**
     * Create new curriculum
     * @param curriculum {@link Curriculum}
     * @return {@link Curriculum}
     */
    Curriculum insertCurriculum(Curriculum curriculum);

    /**
     * Update curriculum details
     * @param curriculum {@link Curriculum}
     * @return {@link Curriculum}
     */
    Curriculum updateCurriculum(Curriculum curriculum);

    /**
     * Delete curriculum
     * @param curriculum {@link Curriculum}
     */
    void deleteCurriculum(Curriculum curriculum);

    /**
     * Get curriculum details by id
     * @param id id of the curriculum
     * @return {@link Curriculum}
     */
    Curriculum getCurriculumById(Long id);

    /**
     * Delete curriculum by id
     * @param id id of the curriculum
     */
    void deleteCurriculumById(Long id);
}
