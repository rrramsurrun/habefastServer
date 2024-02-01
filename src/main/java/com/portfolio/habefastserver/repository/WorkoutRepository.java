package com.portfolio.habefastserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.portfolio.habefastserver.entity.Workout;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {

}
