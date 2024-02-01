package com.portfolio.habefastserver.service;

import java.util.List;

import com.portfolio.habefastserver.entity.Workout;

public interface WorkoutService {

  void addWorkout(Workout workout);

  List<Workout> getWorkouts();
}
