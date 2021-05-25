package com.agiledeveloper.client;

import java.util.ServiceLoader;
import com.agiledeveloper.softdrink.SoftDrink;

public class Client {
  public static void main(String[] args) {
    System.out.println("Let's get some softdrinks");

    ServiceLoader<SoftDrink> serviceLoader =
      ServiceLoader.load(SoftDrink.class);

    for(var softDrink: serviceLoader) {
      System.out.println(softDrink.getName() + ": " + softDrink.getSize());
    }

    System.out.println("let us iterate one more time");
    for(var softDrink: serviceLoader) {
      System.out.println(softDrink.getName() + ": " + softDrink.getSize());
    }

    System.out.println("We will reload and then iterate");
    serviceLoader.reload();

    for(var softDrink: serviceLoader) {
      System.out.println(softDrink.getName() + ": " + softDrink.getSize());
    }
  }
}

