package com.arajit.cracking.code.interview.ch17.hard;

import org.junit.Test;

public class ShuffleCardsTest {

  ShuffleCards shuffleCards = new ShuffleCards();

  @Test
  public void shuffle_array_iterative() {
    int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] result = shuffleCards.shuffleCardIterative(cards);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  @Test
  public void shuffle_array_recursive() {
    int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
        13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    int[] result = shuffleCards.shuffleCardRecursive(cards, cards.length - 1, 1);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }


}
