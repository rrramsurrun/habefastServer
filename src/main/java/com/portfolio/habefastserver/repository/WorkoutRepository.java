package com.portfolio.habefastserver.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portfolio.habefastserver.pojos.Workout;

@Repository
public class WorkoutRepository {

  private List<Workout> workouts = new ArrayList<>(Arrays.asList(
      new Workout("0", "Morning Workout", LocalDateTime.parse("2024-01-26T11:00:00"),
          LocalDateTime.parse("2024-01-26T11:40:00")),
      new Workout("1", "Morning Workout", LocalDateTime.parse("2024-01-27T11:00:00"),
          LocalDateTime.parse("2024-01-27T11:40:00")),
      new Workout("2", "Morning Workout", LocalDateTime.parse("2024-01-28T11:00:00"),
          LocalDateTime.parse("2024-01-28T11:40:00"))));

  public void addWorkout(Workout workout) {
    workouts.add(workout);
  }

  public List<Workout> getWorkouts() {
    return workouts;
  }
}
