package com.arajit.cracking.code.interview.ch16.moderate;

/**
 * Problem 16.1
 *
 * Swap two numbers without using third variable.
 */
public class SwapNumbers {

  // This solution works only for integers.
  void swap(int a, int b) {
    System.out.println("Original numbers a=" + a + ", b=" + b);
    a = a - b;
    b = a + b;
    a = b - a;
    System.out.println("After swap a=" + a + ", b=" + b);
  }

  // Bitwise XOR(^) operator flips return 0 if both bits are equal, else it returns 1
  // a=5(101)
  // b=3(011), a =a^b=110, b=a^b=101, a=a^b=011
  void swapBitwiseXOR(long a, long b) {
    System.out.println("Original numbers a=" + a + ", b=" + b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("After swap a=" + a + ", b=" + b);
  }


}
