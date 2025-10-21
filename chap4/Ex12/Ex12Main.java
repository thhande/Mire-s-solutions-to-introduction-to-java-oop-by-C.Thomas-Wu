package chap4.Ex12;

import java.util.Scanner;
import lib.IExcercise;

public class Ex12Main implements IExcercise {
  public static void main(String[] args) {
    System.out.println("enter your height");
    Scanner scanner = new Scanner(System.in);
    float heightVal = scanner.nextFloat();// enter the height val
    System.out.println("enter your age");
    int age = scanner.nextInt();// same with age
    Height height = new Height(heightVal);
    float recommendedWeight = height.recommendedWeight(age);
    if (recommendedWeight <= 0)
      System.out.println("somehow i think you should die");
    System.out.println("your recommended weight " + height.recommendedWeight(age));// return the reW
    scanner.close();
  }

  // move the code in the main to this
  public void process() {
    System.out.println("enter your height");
    Scanner scanner = new Scanner(System.in);
    float heightVal = scanner.nextFloat();// enter the height val
    System.out.println("enter your age");
    int age = scanner.nextInt();// same with age
    Height height = new Height(heightVal);
    float recommendedWeight = height.recommendedWeight(age);
    if (recommendedWeight <= 0)
      System.out.println("somehow i think you should die");
    System.out.println("your recommended weight " + height.recommendedWeight(age));// return the reW
    scanner.close();
  }
}
