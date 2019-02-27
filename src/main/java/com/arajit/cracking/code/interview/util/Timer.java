package com.arajit.cracking.code.interview.util;

public class Timer {

  long startTime;

  public void start() {
    this.startTime = System.currentTimeMillis();
  }

  public long timeTaken() {
    return System.currentTimeMillis() - this.startTime;
  }

  public long timeTakenSeconds() {
    return (System.currentTimeMillis() - this.startTime) / 1000;
  }

}
