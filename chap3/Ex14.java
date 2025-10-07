package chap3;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double r = sc.nextDouble();

    double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // cal Volume of a sphere
    System.out.println("Volume of the sphere: " + volume);

    sc.close();
  }
}
