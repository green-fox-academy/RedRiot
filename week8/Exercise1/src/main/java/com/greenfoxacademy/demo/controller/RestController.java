package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.*;
import com.greenfoxacademy.demo.model.Error;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController

public class RestController {
  @GetMapping("/doubling")
  public Object doublingTheObject(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    }
    return new Error("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {

    if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }

  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable String appendable) {

    if (appendable == null) {
      return new Error("404");
    }
    return new Appenda(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what") String what, @RequestBody(required = false) DoUntil until) {
    int number1 = 0;
    if (until == null) {
      return new Error("Please provide a number!");
    } else if (what.equals("sum")) {
      for (int i = 1; i <= until.getUntil(); i++) {
        number1 += i;
      }
      return new Result(number1);
    } else {
      number1 = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        number1 = number1 * i;
      }
      return new Result(number1);
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandler) {
    if (arrayHandler.getNumbers().length == 0) {
      return new Error("Please provide some numbers!");
    } else if (arrayHandler.getWhat().equals(null)) {
      return new Error("Please provide what to do with the numbers!");
    }
    return new ArrayCalculator(arrayHandler.getWhat(),arrayHandler);
  }
}
