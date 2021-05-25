package com.agiledeveloper.client;

public class Client {
  public static void main(String[] args) {
    System.out.println("Let's read some good fortune");

    //The code below is not complete. Please feel free to edit or change it.
    ServiceLoader.load(FortuneTeller.class)
      .stream()
      .forEach(System.out::println);    
      
    /*
    The output this code should produced, when completed is:
    Let's read some good fortune
    Your next project release will change the world
    You will fall in love with coding
    Your code will shine with quality    
    */
  }
}
