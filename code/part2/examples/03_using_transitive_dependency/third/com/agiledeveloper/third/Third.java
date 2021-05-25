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

//thethird -> thesecond -> (transitive) thefirst
//Third is able to use First because thesecond is requiring thefirst
//transitively and thethird depends on thesecond


