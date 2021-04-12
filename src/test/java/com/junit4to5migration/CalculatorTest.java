package com.junit4to5migration;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();
  private Calculator calculator;

  @BeforeClass
  public static void beforeClass() {
    // something to do before class
  }

  @AfterClass
  public static void afterClass() {
    // something to do before class
  }

  @Before
  public void before() {
    // something to do before test
    calculator = new Calculator();
  }

  @After
  public void after() {
    // something to do after test
  }

  @Test
  public void testTwoPlusTwoIsFour() {
    assertEquals(4, calculator.addition(2, 2));
  }

  @Test
  public void testTwoPlusTwoIsFourAsString() {
    assertEquals("2 + 2 = 4", 4, calculator.addition("2", "2"));
  }

  @Test
  public void testMultipleCalculationFailures() {
    // assert all
    assertEquals(4, calculator.addition(2, 2));
    assertEquals(5, calculator.subtraction(6, 1));
    assertEquals(8, calculator.addition(2, 6));
    assertEquals(5, calculator.addition("2", "3"));
  }

  @Test
  @Ignore("Not implemented yet!")
  public void testNoImplementedYet() {
    // ignore example
  }

  @Test(expected = NumberFormatException.class)
  public void testNumberFormatExceptionThrown() {
    calculator.addition("foo", "2");
  }

  @Test
  public void testAnotherWayToHandleException() {
    expectedException.expect(NumberFormatException.class);
    expectedException.expectMessage("For input string");

    calculator.addition("foo", "2");
  }
}

