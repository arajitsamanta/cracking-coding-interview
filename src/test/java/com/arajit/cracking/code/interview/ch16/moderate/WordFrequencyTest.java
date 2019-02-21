package com.arajit.cracking.code.interview.ch16.moderate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;

public class WordFrequencyTest {

  WordFrequency wordFrequency = new WordFrequency();

  @Test
  public void get_frequency() {
    String[] input = {"john", "doe", "CaT", "DOG", "Penguin", "Tiger", "Penguin", "horse", "HOrse",
        "Zebra", "ZEBRA", "zebra"};
    assertEquals(2, wordFrequency.getFrequency(input, "penguin"));
    assertEquals(0, wordFrequency.getFrequency(null, "penguin"));
    assertEquals(0, wordFrequency.getFrequency(null, null));
    assertEquals(0, wordFrequency.getFrequency(new String[]{}, null));
    assertEquals(0, wordFrequency.getFrequency(new String[]{""}, ""));
  }

  @Test
  public void get_frequency_faster() {
    String[] input = {"john", "doe", "CaT", "DOG", "Penguin", "Tiger", "Penguin", "horse", "HOrse",
        "Zebra", "ZEBRA", "zebra"};
    WordFrequency.setWordFrequencyMap(input);
    assertEquals(2, WordFrequency.getFrequencyFaster("penguin"));
    assertEquals(0, WordFrequency.getFrequencyFaster(null));
    assertEquals(0, WordFrequency.getFrequencyFaster(""));
    assertEquals(3, WordFrequency.getFrequencyFaster("ZEBRA"));
    assertEquals(1, WordFrequency.getFrequencyFaster("dog"));
    assertEquals(0,WordFrequency.getFrequencyFaster("lion"));
  }

}
