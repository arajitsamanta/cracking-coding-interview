package com.arajit.cracking.code.interview.ch16.moderate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Problem 16.2
 *
 * Design a method to find the frequency of occurrences of any given word in a book. What if we were
 * running this algorithm multiple times?
 */
public class WordFrequency {

  static Map<String, Integer> wordFrequencyMap = new ConcurrentHashMap<>();

  public static void setWordFrequencyMap(
      String[] words) {
    for (String word : words) {
      String key = word.trim().toLowerCase();
      if (key != "") {
        if (!wordFrequencyMap.containsKey(key)) {
          wordFrequencyMap.put(key, 0);
        }
        wordFrequencyMap.put(key, wordFrequencyMap.get(key) + 1);
      }
    }
  }

  //Runtime is O(1), provided that word frequency map is prepopulated
  static int getFrequencyFaster(String word) {
    if (word == null || wordFrequencyMap == null) {
      return 0;
    }
    word = word.toLowerCase();
    if (wordFrequencyMap.containsKey(word)) {
      return wordFrequencyMap.get(word);
    }
    return 0;
  }

  //Runtime complexity O(n), where n is the size of dictionary
  int getFrequency(String[] dictionary, String word) {

    //Return 0 if word is null or dictionary is null/empty
    if (word == null || word.trim().length() == 0 || dictionary == null || dictionary.length == 0) {
      return 0;
    }

    //trim word for white spaces
    word = word.trim();

    int count = 0;
    for (String temp : dictionary) {
      if (temp.equalsIgnoreCase(word)) {
        count++;
      }
    }
    return count;
  }


}
