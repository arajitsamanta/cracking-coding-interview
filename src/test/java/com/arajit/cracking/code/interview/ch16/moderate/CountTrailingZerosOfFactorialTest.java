package com.arajit.cracking.code.interview.ch16.moderate;

import static org.junit.Assert.assertEquals;

import com.arajit.cracking.code.interview.util.Timer;
import org.junit.Test;

public class CountTrailingZerosOfFactorialTest {

  CountTrailingZerosOfFactorial  countTrailingZeros=new  CountTrailingZerosOfFactorial();
  Timer timer=new Timer();

  @Test
  public void count_trailing_zeros_brute_force()  {
    assertEquals(1,countTrailingZeros.countBruteForce(5));
    assertEquals(0,countTrailingZeros.countBruteForce(0));
    assertEquals(0,countTrailingZeros.countBruteForce(-25));
    timer.start();
    assertEquals(3,countTrailingZeros.countBruteForce(19));
    System.out.println("Time taken:"+timer.timeTaken() +"ms");
  }

  @Test
  public void count_trailing_zeros()  {
    assertEquals(2,countTrailingZeros.count(10));
    assertEquals(0,countTrailingZeros.count(0));
    assertEquals(0,countTrailingZeros.count(-999));
    timer.start();
    assertEquals(7,countTrailingZeros.count(30));
    System.out.println("Time taken:"+timer.timeTaken() +"ms");
  }

  @Test
  public void count_trailing_zeros_efficient()  {
    assertEquals(31,countTrailingZeros.countEfficient(126));
    assertEquals(0,countTrailingZeros.countEfficient(0));
    assertEquals(-1,countTrailingZeros.countEfficient(-25));
    timer.start();
    assertEquals(3,countTrailingZeros.countEfficient(19));
    System.out.println("Time taken:"+timer.timeTaken() +"ms");
  }

}
