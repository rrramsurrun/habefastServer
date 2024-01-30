package com.portfolio.habefastserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.habefastserver.pojos.Workout;
import com.portfolio.habefastserver.repository.WorkoutRepository;

@Service
public class WorkoutServiceImpl implements WorkoutService {

  @Autowired
  WorkoutRepository workoutRepository;

  @Override
  public void addWorkout(Workout workout) {
    workoutRepository.addWorkout(workout);
  }

  @Override
  public List<Workout> getWorkouts() {
    return workoutRepository.getWorkouts();
  }

}
