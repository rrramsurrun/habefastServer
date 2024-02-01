package com.portfolio.habefastserver.entity;

import java.time.LocalDateTime;

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
@Table(name = "workout")
public class Workout {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "workout_id")
  private long id;
  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "start_time", nullable = false)
  private LocalDateTime start;
  @Column(name = "end_time", nullable = false)
  private LocalDateTime end;

  public Workout(String name, LocalDateTime start, LocalDateTime end) {
    this.name = name;
    this.start = start;
    this.end = end;
  }

}
