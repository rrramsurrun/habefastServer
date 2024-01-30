package com.portfolio.habefastserver.pojos;

public class ExerciseTemplate {

  private String id;
  private String name;
  private String exerciseType;
  private String bodyPart;

  public ExerciseTemplate(String id, String name, String exerciseType, String bodyPart) {
    this.id = id;
    this.name = name;
    this.exerciseType = exerciseType;
    this.bodyPart = bodyPart;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExerciseType() {
    return this.exerciseType;
  }

  public void setExerciseType(String exerciseType) {
    this.exerciseType = exerciseType;
  }

  public String getBodyPart() {
    return this.bodyPart;
  }

  public void setBodyPart(String bodyPart) {
    this.bodyPart = bodyPart;
  }

}
