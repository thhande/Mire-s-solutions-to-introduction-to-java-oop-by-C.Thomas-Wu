package chap4.Ex9;

import java.util.Scanner;

public class Ex9Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the radius of the first circle");
    float r1 = scanner.nextFloat();
    Circle circle1 = new Circle(r1);
    System.out.println("enter the radius of the second circle");
    float r2 = scanner.nextFloat();
    Circle circle2 = new Circle(r2);// use abs so that the users do not need to care whether circle is larger
    float output = Math.abs((float) circle1.area() - (float) circle2.area());// type cast so can use area with abs
    System.out.println("area of the ring :" + output);
    scanner.close();
  }
}
