package com.agiledeveloper.second;

import com.agiledeveloper.first.First;

public class Second {
  public static void main(String[] args) {
    System.out.println("this is Second");

    var first = new First();
    System.out.println(first.getInfo());
  }
}

