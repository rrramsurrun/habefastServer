package com.portfolio.habefastserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.habefastserver.pojos.Workout;
import com.portfolio.habefastserver.service.WorkoutService;

@RestController
public class WorkoutController {

  // Workout Management
  @Autowired
  WorkoutService workoutService;

  @CrossOrigin(origins = "http://127.0.0.1:5173/")
  @GetMapping("workouts")
  public ResponseEntity<List<Workout>> getWorkouts() {
    return new ResponseEntity<>(workoutService.getWorkouts(), HttpStatus.OK);
  }

  @PostMapping("workouts")
  public ResponseEntity<HttpStatus> addWorkout(@RequestBody Workout workout) {
    workoutService.addWorkout(workout);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

}
