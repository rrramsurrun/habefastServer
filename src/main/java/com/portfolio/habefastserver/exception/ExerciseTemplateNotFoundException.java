package com.portfolio.habefastserver.exception;

public class ExerciseTemplateNotFoundException extends RuntimeException {
  public ExerciseTemplateNotFoundException(Long exerciseTemplateId) {
    super("Exercise Template with ID of " + exerciseTemplateId + " could not be found");
  }

}
