package com.greenfoxacademy.demo.controller;



import com.greenfoxacademy.demo.DemoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
@EnableWebMvc

public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;


  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void doublingWithInputNumber() throws Exception {
    mockMvc.perform(get("/doubling?input=6")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.received", is(6)))
            .andExpect(jsonPath("$.result", is(12)));
  }

  @Test
  public void doublingWithoutInput() throws Exception {
    mockMvc.perform(get("/doubling")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }


  @Test
  public void greeterWithInputNameAndTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=Tung&title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Tung, my dear student!")));
  }

  @Test
  public void greeterWithoutInputName() throws Exception {
    mockMvc.perform(get("/greeter?title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeterWithoutInputTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()
            )
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }
  @Test
  public void doUntilFactorInputProvided() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void doUntilSumInputProvided() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doUntilOperationProvidedButInputNumberNotProvided() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType("application/json;charset=UTF-8")
            .content("")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void doUntilWithoutOperationProvided() throws Exception {
    mockMvc.perform(post("/dountil")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}")
    )
            .andExpect(status().is4xxClientError());
  }

}