package com.portfolio.habefastserver.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.habefastserver.repository.ExerciseTemplateRepository;
import com.portfolio.habefastserver.pojos.ExerciseTemplate;

@Service
public class ExerciseTemplateServiceImpl implements ExerciseTemplateService {

  @Autowired
  ExerciseTemplateRepository exerciseTemplateRepository;

  @Override
  public List<ExerciseTemplate> getExerciseTemplates() {
    return exerciseTemplateRepository.getExerciseTemplates();
  }

  @Override
  public void addExerciseTemplate(ExerciseTemplate exerciseTemplate) {
    exerciseTemplateRepository.addExerciseTemplate(exerciseTemplate);
  }

  @Override
  public void editExerciseTemplate(ExerciseTemplate exerciseTemplate) {
    int index = findIndexById(exerciseTemplate.getId());
    exerciseTemplateRepository.editExerciseTemplate(exerciseTemplate, index);
  }

  private int findIndexById(String id) {
    return IntStream.range(0, exerciseTemplateRepository.getExerciseTemplates().size())
        .filter(index -> exerciseTemplateRepository.getExerciseTemplates().get(index).getId().equals(id))
        .findFirst()
        .orElseThrow();
  }

}
