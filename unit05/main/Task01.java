package by.epam.unit05.main;

import java.util.Scanner;

public class Task01 {
  public static void main(String[] args) {

    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value for a > ");
    a = sc.nextInt();
    System.out.print("Enter value for b > ");
    b = sc.nextInt();

    int gcd = greatestCommonDivisorFind(a, b);
    int lcm = leastCommonMultipleFind(a, b);

    System.out.println("gcd = " + gcd);
    System.out.println("lcm = " + lcm);
  }

  public static int greatestCommonDivisorFind(int m, int n) {
    int gcd;
    int temp;
    int x = 0;

    if (m < n) {
      temp = m;
      m = n;
      n = temp;
    }

    if (m % n == 0) {
      gcd = m;
    } else {
      int key = m % n;
      while (key != 0) {
        x = key;
        key = n % x;
        n = x;
      }

      gcd = x;
    }
    return gcd;
  }

  public static int leastCommonMultipleFind(int m, int n) {
    int lcm = m * n / greatestCommonDivisorFind(m, n);
    return lcm;
  }
}
