package com.arajit.cracking.code.interview.ch16.moderate;

import org.junit.Test;

public class SwapNumbersTest {

  SwapNumbers swapNumbers = new SwapNumbers();

  @Test
  public void swap_positive_integers() {
    swapNumbers.swap(9, 4);
  }

  @Test
  public void swap_negative_Integers() {
    swapNumbers.swap(2, -5);
  }

  @Test
  public void swap_using_bitwise_xor() {
    swapNumbers.swapBitwiseXOR(5, 3);
  }

}
