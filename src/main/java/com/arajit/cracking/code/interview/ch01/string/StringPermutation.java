package com.arajit.cracking.code.interview.ch01.string;

public class StringPermutation {

  void indent(int n){
    for(int i=0;i<n;i++){
      System.out.print("    ");
    }
  }

  void permute(String a){
    permuteHelper("",a);
  }

  void permuteHelper(String soFar,String rest){
    indent(soFar.length());
    System.out.println("permuteHelper("+soFar+","+rest+")");
    //base case
    if(rest.isEmpty()){
      System.out.println(soFar);
    }else{
      for(int i=0;i<rest.length();i++){
        char ch=rest.charAt(i);
        String left=rest.substring(0,i)+rest.substring(i+1);
        permuteHelper(soFar+ch,left);
      }
    }
  }

}
