package com.arajit.cracking.code.interview.ch16.moderate;

public class CountTrailingZerosOfFactorial {

  long factorial(long n) {
    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  /**
   * Problem with this approach is that very soon we will ran out of size of long/int when
   * calculating factorial. For e.g: factorial(30)=-8764578968847253504 which is an integer
   * overflow
   */
  int countBruteForce(long input) {
    long number = factorial(input);
    if (number < 0) {
      return -1;
    }
    int count = 0;
    while (number > 0) {
      long remainder = number % 10;
      if (remainder == 0) {
        count++;
      } else {
        break;
      }
      number /= 10;
    }
    return count;
  }

  /**
   * If the number is a 5 of five, return which power of 5. For example: 5 -> 1,25-> 2, etc.
   */
  int factorsOf5(int i) {
    int count = 0;
    while (i % 5 == 0) {
      count++;
      i /= 5;
    }
    return count;
  }

  /*
   * With this approach we are not going to actually calculate factorial. All we are going to do is
   * to check if number k is contributing towards trailing zeros where k is any number between 1..
   * n.
   *
   * A trailing zero is created with multiples of 10, and multiples of 10 are created with pairs of
   * 5-multiples and 2-multiples.Therefore, to count the number of zeros, we only need to count the
   * pairs of multiples of 5 and 2.
   *
   * There will always be more multiples of 2 than 5, though, so simply counting the number of
   * multiples of 5 is sufficient. One "gotcha" here is 15 contributes a multiple of 5 (and
   * therefore one trailing zero), while 25 contributes two (because 25 = 5 * 5).
   */
  int count(int number) {
    int count = 0;
    for (int i = 2; i <= number; i++) {
      count += factorsOf5(i);
    }
    return count;
  }

  /**
   * Using this approach, we would first count the number of multiples of 5 between 1 and n (which
   * is n/5), then the number of multiples of 25 (n/25), then 125, and so on .
   *
   * To count how many multiples of m are in n, we can just divide n by m.
   */
  int countEfficient(int number) {
    if (number < 0) {
      return -1;
    }
    int count = 0;
    for (int i = 5; number / i > 0; i *= 5) {
      count += number / i;
    }
    return count;
  }

}
