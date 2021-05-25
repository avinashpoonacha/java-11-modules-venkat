package com.agiledeveloper.user;

import com.agiledeveloper.fortunes.FortuneTeller;

public class Client {
  public static void main(String[] args) {
    System.out.println("This Client should belong to a client module and use the fortuneteller module");

    String clientModuleName = Client.class.getModule().getName();
    System.out.println("Client's module name: " + clientModuleName);
    String expectedClientModuleName = "com.agiledeveloper.client";

    if(!clientModuleName.equals(expectedClientModuleName)) {
      throw new RuntimeException("Unexpected Module name, expecting " + expectedClientModuleName);
    }

    FortuneTeller fortuneTeller = new FortuneTeller();

    String fortuneTellerModuleName = FortuneTeller.class.getModule().getName();

    System.out.println("FortuneTeller's module name: " + fortuneTellerModuleName);
    String expectedFortunetellerModuleName = "com.agiledeveloper.fortuneteller";

    if(!fortuneTellerModuleName.equals(expectedFortunetellerModuleName)) {
      throw new RuntimeException("Unexpected Module name, expecting " + expectedFortunetellerModuleName);
    }

    System.out.println(fortuneTeller.tellFortune());
  }
}
