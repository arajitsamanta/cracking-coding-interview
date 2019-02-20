package com.arajit.cracking.code.interview.ch17.hard;

/**
 * Problem 17.1
 *
 * Add two numbers without arithmetic operator
 */
public class AddNumbers {

  //a=2(010), b=3(011)
  int add(int a ,int b){
    System.out.println("add("+a+","+b+")");
    if(b==0) return a;
    int sum=a^b;
    int carry=(a&b) <<1;
    return add(sum,carry);
  }

  int addIterative(int a ,int b){
    //if(b==0) return a;
    while(b!=0){
      int sum=a^b;
      int carry=(a&b) <<1;
      a=sum;
      b=carry;
    }
    return a;
  }

}
