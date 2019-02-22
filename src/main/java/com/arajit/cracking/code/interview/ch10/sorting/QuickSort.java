package com.arajit.cracking.code.interview.ch10.sorting;

import java.util.Arrays;

/**
 * In quick sort we pick a random element and partition the array, such that all numbers that are
 * less than the partitioning element come before all elements that are greater than it. The
 * partitioning can be performed efficiently through a series of swaps
 *
 * Runtime: O(n log( n)) average, O(n2 ) worst case. Memory: 0( log(n)).
 *
 * left
 */
public class QuickSort {

  void indent(int n){
    for(int i=0;i<n;i++){
      System.out.print("  ");
    }
  }

  void sort(int[] arr, int left, int right,int indentLen) {
    indent(indentLen);
    System.out.print("quickSort(");
    Arrays.stream(arr).forEach(System.out::print);
    System.out.println(","+left+","+right+")");
    int index = partition(arr, left, right);
    if (left < index - 1) { // Sort left half
      sort(arr, left, index - 1,indentLen+=2);
    }
    if (index < right) { // Sort right half
      sort(arr, index, right,indentLen+=2);
    }
  }

  int partition(int[] arr, int left, int right) {
    int pivot = arr[(left + right) / 2]; // Pick pivot point
    while (left <= right) {
      // Find element on left that should be on right
      while (arr[left] < pivot) {
        left++;
      }

      // Find element on right that should be on left
      while (arr[right] > pivot) {
        right--;
      }

      // Swap elements, and move left and right indices
      if (left <= right) {
        //Swap left and right
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        //move left and right indices
        left++;
        right--;
      }
    }
    return left;
  }

}
