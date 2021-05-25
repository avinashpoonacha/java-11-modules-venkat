package com.agiledeveloper.second;

import com.agiledeveloper.first.First;
import com.agiledeveloper.first.Helper;
//import com.agiledeveloper.stuff.HelperImpl; //ERROR
//error: package com.agiledeveloper.stuff is not visible

import java.lang.reflect.*;

public class Second {
  public static void main(String[] args) throws Exception {
    System.out.println("this is Second from " + Second.class.getModule());

    var first = new First();
    System.out.println(first.getInfo());

    Helper helper = first.createHelper();

    System.out.println(helper);

    //HelperImpl hi = (HelperImpl) helper; //ERROR

    System.out.println(helper.add(1, 3));

    Method method = helper.getClass().getMethod("secret");
    System.out.println(method);

    method.invoke(helper); //This is called an act of war
  }
}

