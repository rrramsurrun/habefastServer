package com.portfolio.habefastserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.portfolio.habefastserver.entity.ExerciseTemplate;
import com.portfolio.habefastserver.service.ExerciseTemplateService;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ExerciseTemplateController {

  // ExerciseTemplate Management
  @Autowired
  ExerciseTemplateService exerciseTemplateService;

  @GetMapping("exercises")
  public ResponseEntity<List<ExerciseTemplate>> getExerciseTemplates() {
    return new ResponseEntity<>(exerciseTemplateService.getExerciseTemplates(), HttpStatus.OK);
  }

  @PostMapping("exercises")
  public ResponseEntity<ExerciseTemplate> addExerciseTemplate(@RequestBody ExerciseTemplate exerciseTemplate) {
    exerciseTemplateService.addExerciseTemplate(exerciseTemplate);
    return new ResponseEntity<>(exerciseTemplate, HttpStatus.CREATED);
  }

  @PutMapping("exercises")
  public ResponseEntity<ExerciseTemplate> editExerciseTemplate(@RequestBody ExerciseTemplate exerciseTemplate) {
    exerciseTemplateService.editExerciseTemplate(exerciseTemplate);
    return new ResponseEntity<>(exerciseTemplate, HttpStatus.OK);
  }

}
