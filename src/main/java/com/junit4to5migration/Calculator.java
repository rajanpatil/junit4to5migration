package com.junit4to5migration;

public class Calculator {

  public int addition(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
  }

  public int subtraction(int numberOne, int numberTwo) {
    return numberOne - numberTwo;
  }

  public int multiplication(int numberOne, int numberTwo) {
    return numberOne * numberTwo;
  }

  public int division(int numberOne, int numberTwo) {
    return numberOne / numberTwo;
  }

  public int addition(String numberOne, String numberTwo) {
    return Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
  }

}
