package chap3;

import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length in centimeters: "); // enter the len
    double cm = sc.nextDouble();

    double totalInches = cm / 2.54; // turn into inches
    int feet = (int) (totalInches / 12);// turn into feet
    double inches = totalInches % 12;

    System.out.println("Feet: " + feet + ", Inches: " + inches);// print out

    sc.close();
  }
}
