package com.portfolio.habefastserver.pojos;

import java.time.LocalDateTime;

public class Workout {
  private String id;
  private String name;
  private LocalDateTime start;
  private LocalDateTime end;

  public Workout(String id, String name, LocalDateTime start, LocalDateTime end) {
    this.id = id;
    this.name = name;
    this.start = start;
    this.end = end;
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

  public LocalDateTime getStart() {
    return this.start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public LocalDateTime getEnd() {
    return this.end;
  }

  public void setEnd(LocalDateTime end) {
    this.end = end;
  }

}
