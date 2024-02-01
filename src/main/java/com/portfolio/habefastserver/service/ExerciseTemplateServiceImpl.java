package com.portfolio.habefastserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.habefastserver.entity.ExerciseTemplate;
import com.portfolio.habefastserver.repository.ExerciseTemplateRepository;

@Service
public class ExerciseTemplateServiceImpl implements ExerciseTemplateService {

  @Autowired
  ExerciseTemplateRepository exerciseTemplateRepository;

  @Override
  public List<ExerciseTemplate> getExerciseTemplates() {
    return (List<ExerciseTemplate>) exerciseTemplateRepository.findAll();
  }

  @Override
  public void addExerciseTemplate(ExerciseTemplate exerciseTemplate) {
    exerciseTemplateRepository.save(exerciseTemplate);
  }

  @Override
  public void editExerciseTemplate(ExerciseTemplate exerciseTemplate) {
    exerciseTemplateRepository.save(exerciseTemplate);
  }

}
