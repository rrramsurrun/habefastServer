package com.portfolio.habefastserver.service;

import java.util.List;

import com.portfolio.habefastserver.entity.ExerciseTemplate;

public interface ExerciseTemplateService {
  List<ExerciseTemplate> getExerciseTemplates();

  void addExerciseTemplate(ExerciseTemplate exerciseTemplate);

  void editExerciseTemplate(ExerciseTemplate exerciseTemplate);
}
