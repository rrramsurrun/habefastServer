package com.portfolio.habefastserver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "exercise_template")
public class ExerciseTemplate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ex_template_id")
  private long id;
  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "type", nullable = false)
  private String exerciseType;
  @Column(name = "body_part", nullable = false)
  private String bodyPart;

  public ExerciseTemplate(String name, String exerciseType, String bodyPart) {
    this.name = name;
    this.exerciseType = exerciseType;
    this.bodyPart = bodyPart;
  }

}
