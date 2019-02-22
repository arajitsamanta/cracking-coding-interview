package com.arajit.cracking.code.interview.ch10.sorting;

import org.junit.Test;

public class QuickSortTest {

  QuickSort quickSort=new QuickSort();

  @Test
  public void quick_sort(){
    int[] arr={1,5,4,3,2};
    quickSort.sort(arr,0,arr.length-1,1);
  }

}
