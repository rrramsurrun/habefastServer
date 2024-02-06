package com.portfolio.habefastserver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.habefastserver.entity.ExerciseTemplate;
import com.portfolio.habefastserver.exception.ExerciseTemplateNotFoundException;
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
    if (exerciseTemplate.getId() != null) {
      throw new IllegalArgumentException("Cannot create a new exercise template with a non-null ID");
    }
    exerciseTemplateRepository.save(exerciseTemplate);
  }

  @Override
  public void editExerciseTemplate(ExerciseTemplate exerciseTemplate) {
    if (exerciseTemplate.getId() == null) {
      throw new IllegalArgumentException("Edit Exercise requires an ID");
    }
    Optional<ExerciseTemplate> e = exerciseTemplateRepository.findById(exerciseTemplate.getId());
    if (!e.isPresent()) {
      throw new ExerciseTemplateNotFoundException(exerciseTemplate.getId());
    }

    exerciseTemplateRepository.save(exerciseTemplate);
  }

}
