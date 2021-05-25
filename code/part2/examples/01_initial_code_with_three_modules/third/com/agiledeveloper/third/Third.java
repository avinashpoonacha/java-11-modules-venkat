package com.agiledeveloper.third;

import com.agiledeveloper.first.First;
import com.agiledeveloper.second.Second;

public class Third {
  public static void main(String[] args) {
    System.out.println("this is Third from " + Third.class.getModule());

    System.out.println(new Second());

    System.out.println(new First());
  }
}

//thethird -> thesecond -> thefirst
//Third wants to use the First. ERROR

