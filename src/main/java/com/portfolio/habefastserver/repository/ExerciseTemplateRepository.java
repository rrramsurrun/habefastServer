package com.portfolio.habefastserver.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portfolio.habefastserver.pojos.ExerciseTemplate;

@Repository
public class ExerciseTemplateRepository {

  private List<ExerciseTemplate> exerciseTemplates = new ArrayList<>(Arrays.asList(
      new ExerciseTemplate("0", "Bench Press", "Reps", "Chest"),
      new ExerciseTemplate("1", "Cable Row", "Reps", "Back"),
      new ExerciseTemplate("2", "Back Squat", "Reps", "Legs"),
      new ExerciseTemplate("3", "Deadlift", "Reps", "Legs")));

  public List<ExerciseTemplate> getExerciseTemplates() {
    return exerciseTemplates;
  }

  public void addExerciseTemplate(ExerciseTemplate exerciseTemplate) {
    exerciseTemplates.add(exerciseTemplate);
  }

  public void editExerciseTemplate(ExerciseTemplate exerciseTemplate, int index) {
    exerciseTemplates.set(index, exerciseTemplate);
  }

}
