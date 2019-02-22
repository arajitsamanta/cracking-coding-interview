package com.arajit.cracking.code.interview.ch17.hard;

/**
 * Problem 17.3
 *
 * Randomly generate a set of m integers from an array of size n. Each element must have equal
 * probability of being chosen.
 */
public class PickRandomMElements {

  void indent(int n){
    for(int i=0;i<n;i++){
      System.out.print("  ");
    }
  }

  int rand(int start, int end) {
    return start + (int) Math.random() * (end - start + 1);
  }

  int[] pickElementsIterative(int[] input, int m) {
    int subset[] = new int[m];

    //fill in subset array with first part of original array
    for (int i = 0; i < m; i++) {
      subset[i] = input[i];
    }

    //Go though rest of the array and randomly choose an element
    for (int i = m; i < input.length; i++) {
      int k = rand(0, i); //Random# between 0 and i, inclusive
      if (k < m) {
        subset[k] = input[i];
      }
    }
    return subset;
  }

  int[] pickElementsRecursive(int[] input, int m, int n,int indentLen) {
    indent(indentLen);
    System.out.println("pickElementsRecursive("+input+","+n+")");
    if (n + 1 == m) {
      int[] subset=new int[m];
      for (int i = 0; i < m; i++) {
        subset[i] = input[i];
      }
      return subset;
    } else if (n + 1 > m) {
      int[] subset = pickElementsRecursive(input, m, n - 1,indentLen+=2);
      int k = rand(0, n); //Random# between 0 and i, inclusive
      if (k < m) {
        subset[k] = input[n];
      }
      return subset;
    }

    return null;
  }

}
