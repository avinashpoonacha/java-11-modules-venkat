package com.agiledeveloper.first;

import com.agiledeveloper.stuff.HelperImpl;

public class First {
  public String getInfo() {
    return "this is First from " + First.class.getModule();
  }

  public Helper createHelper() {
    return new HelperImpl();
  }
}

