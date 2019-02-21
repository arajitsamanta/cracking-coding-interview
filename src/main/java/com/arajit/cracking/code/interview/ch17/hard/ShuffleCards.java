package com.arajit.cracking.code.interview.ch17.hard;

/**
 * Problem 17.2
 *
 * Shuffle a deck of cards
 */
public class ShuffleCards {

  int rand(int lower, int higher) {
    return lower + (int) (Math.random() * (higher - lower + 1));
  }

  void indent(int n){
    for(int i=0;i<n;i++){
      System.out.print("  ");
    }
  }

  int[] shuffleCardRecursive(int[] cards, int n,int indentLen) {
    indent(indentLen);
    System.out.println("shuffleCardRecursive("+cards+","+n+")");
    if (n == 0) {
      return cards;
    }

    shuffleCardRecursive(cards, n - 1,indentLen+=2);
    int k = rand(0, n);
    int temp = cards[k];
    cards[k] = cards[n];
    cards[n] = temp;

    return cards;


  }

  int[] shuffleCardIterative(int[] cards) {
    for (int i = 0; i < cards.length; i++) {
      int k = rand(0, i);
      int temp = cards[k];
      cards[k] = cards[i];
      cards[i] = temp;
    }
    return cards;
  }

}
