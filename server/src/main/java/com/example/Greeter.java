package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Say hello to the provide person
   * @param  someone name of the person
   * @return         hello message
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

