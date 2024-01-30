package com.portfolio.habefastserver.service;

import java.util.List;

import com.portfolio.habefastserver.pojos.ExerciseTemplate;

public interface ExerciseTemplateService {
  List<ExerciseTemplate> getExerciseTemplates();

  void addExerciseTemplate(ExerciseTemplate exerciseTemplate);

  void editExerciseTemplate(ExerciseTemplate exerciseTemplate);
}
