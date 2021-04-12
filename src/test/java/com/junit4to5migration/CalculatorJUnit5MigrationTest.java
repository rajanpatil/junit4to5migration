package com.junit4to5migration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorJUnit5MigrationTest {

  private Calculator calculator;

  @BeforeEach
  void beforeEach() {
    calculator = new Calculator();
  }

  @Test
  @DisplayName("2 + 2 = 4")
  public void testTwoPlusTwoIsFour() {
    assertEquals(4, calculator.addition(2, 2));
  }

  @Test
  @DisplayName("\"2\" + \"2\" = 4")
  public void testTwoPlusTwoIsFourAsString() {
    assertEquals(4, calculator.addition("2", "2"), "2 + 2 = 4");
  }

  @Test
  @DisplayName("test multiple calculations")
  public void testMultipleCalculationFailures() {
    Assertions.assertAll(
        () -> assertEquals(4, calculator.addition(2, 2)),
        () -> assertEquals(5, calculator.subtraction(6, 1)),
        () -> assertEquals(8, calculator.addition(2, 6)));
  }

  @Test
  @Disabled("Not implemented yet!")
  public void testNoImplementedYet() {
    // ignore example
  }

  @Test
  @DisplayName("NumberFormatException scenario")
  public void testAnotherWayToHandleException() {

    NumberFormatException foo = Assertions
        .assertThrows(NumberFormatException.class, () -> calculator.addition("foo", "2"));

    assertEquals("For input string: \"foo\"", foo.getMessage());

  }

}
