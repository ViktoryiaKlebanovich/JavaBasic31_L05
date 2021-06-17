package by.epam.unit05.main;
import java.util.Random;

public class Task04 {
  public static void main(String[] args) {
    int[] array = new int[10];
    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(1000);
    }
    System.out.print("Array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("[%2d] ", array[i]);
    }
    int a = 1;
    int b = 2;
    int c = 3;
    for (int k = 1, m = 3; m <= array.length; k++, m++) {
      System.out.println("\nSum:  D[" + a + "] + D[" + b + "] + D[" + c + "] = " + sum(array, k, m));
      a++;
      b++;
      c++;
    }
  }

  public static int sum(int[] array, int k, int m) {
    int sum = 0;
    for (int i = k - 1; i <= m - 1; i++) {
      sum = sum + array[i];
    }
    return sum;
  }
}
