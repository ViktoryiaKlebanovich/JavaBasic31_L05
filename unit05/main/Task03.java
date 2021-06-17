package by.epam.unit05.main;
import java.util.Random;

public class Task03 {
  public static void main(String[] args) {
    Random rand = new Random();
    int a = rand.nextInt(1000);
    int b = rand.nextInt(100);
    System.out.println("Number 1 = " + a);
    System.out.println("Number 2 = " + b);
    String result = maxdigit(a, b);
    if (result.equals("true")) {
      System.out.println("Number " + a + " has more digits then number " + b + ".");
    } else {
      System.out.println("Number " + b + " has more digits then number " + a + ".");
    }
  }

  public static String maxdigit(int x, int y) {
    int first = Integer.toString(x).length();
    int second = Integer.toString(y).length();
    String result = "";
    if (first > second) {
      result = "true";
    } else {
      result = "false";
    }
    return result;
  }
}
