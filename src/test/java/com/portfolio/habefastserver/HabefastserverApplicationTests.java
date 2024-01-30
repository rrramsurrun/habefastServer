package com.portfolio.habefastserver;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.RequestBuilder;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class HabefastserverApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void contextLoads() {
    assertNotNull(mockMvc);
  }

  @Test
  public void testGetExercises() throws Exception {
    // TODO Add Get integration tests
  }

}
