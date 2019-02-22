package com.arajit.cracking.code.interview.ch17.hard;

import java.util.Arrays;
import org.junit.Test;

public class PickRandomMElementsTest {

  PickRandomMElements pickRandomMElements=new PickRandomMElements();

  @Test
  public void pick_random_M_elements_iterative(){
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] result=pickRandomMElements.pickElementsIterative(input,5);
    Arrays.stream(result).forEach(System.out::println);
  }

  @Test
  public void pick_random_M_elements_recursively(){
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] result=pickRandomMElements.pickElementsRecursive(input,5,input.length-1,1);
    Arrays.stream(result).forEach(System.out::println);
  }

}
