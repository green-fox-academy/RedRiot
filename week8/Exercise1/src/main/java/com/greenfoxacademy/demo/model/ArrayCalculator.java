package com.greenfoxacademy.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ArrayCalculator {
  private String result;

  public ArrayCalculator() {
  }

  public ArrayCalculator(String operator, ArrayHandler arrayHandler) {
    if (operator.equals("sum")) {
      int sumNumber = 0;
      for (int i = 0; i <arrayHandler.getNumber().length ; i++) {
        sumNumber += arrayHandler.getNumber()[i];
      }
      this.result = Integer.toString(sumNumber);

    } else if (operator.equals("multiply")) {
      int sumNumber = 0;
      for (int i = 0; i < arrayHandler.getNumber().length; i++) {
        sumNumber *= arrayHandler.getNumber()[i];
      }
      this.result = Integer.toString(sumNumber);
    } else if (operator.equals("double")) {
      List<Integer> doubleTheNumbers = new ArrayList<>();
      for (int i = 0; i < arrayHandler.getNumber().length; i++) {
        doubleTheNumbers.add(arrayHandler.getNumber()[i] * 2);
      }
      this.result = arrayHandler.toString();
    }
  }
}
