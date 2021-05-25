package com.agiledeveloper.coke;

import com.agiledeveloper.softdrink.SoftDrink;

public class Coke implements SoftDrink {
  public Coke() {
    System.out.println("creating coke " + this);
  }

  public String getName() { return "Coke"; }
  public int getSize() { return 12; }
}

