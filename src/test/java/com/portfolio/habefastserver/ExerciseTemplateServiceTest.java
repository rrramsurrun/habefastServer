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

import com.portfolio.habefastserver.entity.ExerciseTemplate;
import com.portfolio.habefastserver.repository.ExerciseTemplateRepository;
import com.portfolio.habefastserver.service.ExerciseTemplateServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ExerciseTemplateServiceTest {

  @Mock
  private ExerciseTemplateRepository exerciseTemplateRepositoryMock;
  @InjectMocks
  ExerciseTemplateServiceImpl exerciseTemplateServiceImpl;

}
