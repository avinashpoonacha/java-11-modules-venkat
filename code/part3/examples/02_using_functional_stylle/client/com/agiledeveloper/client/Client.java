package com.agiledeveloper.client;

import java.util.ServiceLoader;
import com.agiledeveloper.softdrink.SoftDrink;

public class Client {
  public static void main(String[] args) {
    System.out.println("Let's get some softdrinks using functional style");

    ServiceLoader.load(SoftDrink.class)
      .stream()
      .map(provider -> provider.get())
      .map(softDrink -> softDrink.getName() + ": " + softDrink.getSize())
      .forEach(System.out::println);
  }
}

