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

//Which option is better?

//When you use transitive, it becomes part of your contract.
//You don't want to reveal your implementation details to the outside 
//word - think about encapsulation.

//If you are using a third part library, then do not add the requires
//to them as transitive. Why? In the future, if you decide not to use
//those third party dependencies, you are not stuck with the requires.

//Transitive is very useful in the short term when we are breaking
//a ball-of-mud into smaller modules.

//I recommend using transitive only for this reason.
//As you chip away your ball-of-mud into smaller modules, you can
//incrementally evolve the module without breaking existing clients.
//Eventually your ball-of-mud module will becomes a holder of
//transitive dependencies and can be deprecated at some point


