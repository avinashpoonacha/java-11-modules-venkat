public class Sample {
  public static void main(String[] args) {
    System.out.println(System.getProperty("java.version"));
  }
}

//Take this code, first compile using very old Java version, like
//Java 8 or even older.

//javac -d /tmp/classes Sample.java
//java -classpath /tmp/classes Sample
//1.8.0_281

//Now, without changing any code or recompiling the code, 
//change the version of Java to use.

//java -classpath /tmp/classes Sample
//16

//Java continues to offer backward compatibility.
//We took code compiled using Java 8 and ran it as is in Java 16.

//What worked before works still (for most part)...

