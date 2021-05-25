package com.agiledeveloper.pepsi;

import com.agiledeveloper.softdrink.SoftDrink;

public class DietPepsi implements SoftDrink {
  private int size;

  private DietPepsi(int size) {
    this.size = size;
  }

  public static DietPepsi provider() { //need this if we do not have a public no-argument constructor
    return new DietPepsi(10);
  }

  public String getName() { return "DietPepsi"; }
  public int getSize() { return size; }
}

