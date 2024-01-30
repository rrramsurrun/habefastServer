package com.portfolio.habefastserver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.portfolio.habefastserver.pojos.ExerciseTemplate;
import com.portfolio.habefastserver.repository.ExerciseTemplateRepository;
import com.portfolio.habefastserver.service.ExerciseTemplateServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ExerciseTemplateServiceTest {

  @Mock
  private ExerciseTemplateRepository exerciseTemplateRepositoryMock;
  @InjectMocks
  ExerciseTemplateServiceImpl exerciseTemplateServiceImpl;

  @Test
  public void getExerciseTemplatesFromRepoTest() {
    when(exerciseTemplateRepositoryMock.getExerciseTemplates()).thenReturn(Arrays.asList(
        new ExerciseTemplate("0", "Bench Press", "Reps", "Chest"),
        new ExerciseTemplate("1", "Cable Row", "Reps", "Back"),
        new ExerciseTemplate("2", "Back Squat", "Reps", "Legs"),
        new ExerciseTemplate("3", "Deadlift", "Reps", "Legs")));

    List<ExerciseTemplate> result = exerciseTemplateServiceImpl.getExerciseTemplates();

    assertEquals("0", result.get(0).getId());
    assertEquals("Cable Row", result.get(1).getName());
    assertEquals("Reps", result.get(2).getExerciseType());
    assertEquals("Legs", result.get(3).getBodyPart());
  }

}
