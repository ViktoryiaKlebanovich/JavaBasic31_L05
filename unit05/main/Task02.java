package by.epam.unit05.main;
import java.util.Random;

public class Task02 {
  public static void main(String[] args) {
    int[] array = new int[3];
    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(1000);
    }
    System.out.print("3 numbers: ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("[%3d] ", array[i]);
    }
    int s = min(array);
    int l = max(array);
    System.out.println("\nThe smallest number in array is: " + s + ".");
    System.out.println("The largest number in array is: " + l + ".");
  }

  public static int min(int[] array) {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static int max(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }
}
