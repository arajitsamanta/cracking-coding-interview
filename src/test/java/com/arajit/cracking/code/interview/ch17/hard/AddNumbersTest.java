package com.arajit.cracking.code.interview.ch17.hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddNumbersTest {

  AddNumbers addNumbers=new AddNumbers();

  @Test
  public void add_without_arithmetic_operator(){
    assertEquals(5,addNumbers.add(2,3));
  }

  @Test
  public void add_without_arithmetic_operator_iterative(){
    assertEquals(-4,addNumbers.add(3,-7));
  }

}
