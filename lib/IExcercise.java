// many others IDE only work with only one main class, so we cannot throw all these file into the src
//instead, let the Ex classes inherit this interface and put the code in the main function in to the process function
//in the main class, we will run the exs like this
//example: try running chap4.Ex12
//import chap4.Ex12
package lib;

public interface IExcercise {
  void process();
}

// //for example, im trying to run Ex12Main
// import chap4.Ex12.Ex12Main;
// import lib.IExcercise;

// public class Main {
// public static void main(String args[]) {
// IExcercise currentExcercise = new Ex12Main();
// currentExcercise.process();
// }
// }

// package chap4.Ex12;

// import java.util.Scanner;
// import lib.IExcercise;

// public class Ex12Main implements IExcercise {
// //move the code in the main to this
// public void process() {
// System.out.println("enter your height");
// Scanner scanner = new Scanner(System.in);
// float heightVal = scanner.nextFloat();// enter the height val
// System.out.println("enter your age");
// int age = scanner.nextInt();// same with age
// Height height = new Height(heightVal);
// float recommendedWeight = height.recommendedWeight(age);
// if (recommendedWeight <= 0)
// System.out.println("somehow i think you should die");
// System.out.println("your recommended weight " +
// height.recommendedWeight(age));// return the reW
// scanner.close();
// }
// }
