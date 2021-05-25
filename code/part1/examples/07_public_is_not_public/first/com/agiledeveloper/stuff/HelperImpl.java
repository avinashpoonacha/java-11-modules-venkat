package com.agiledeveloper.stuff;

import com.agiledeveloper.first.Helper;

public class HelperImpl implements Helper {
  public int add(int op1, int op2) {
    System.out.println("add called...");

    return op1 + op2;
  }

  public void secret() {
    System.out.println("shhhhhhh...");
  }
}

