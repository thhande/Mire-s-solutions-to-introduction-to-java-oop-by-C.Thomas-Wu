package chap2;

import java.util.Scanner;

public class Ex28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter you string , please remember the length must be odd");// input the string
    String input = scanner.next();
    while (input.length() % 2 == 0) {
      System.out.println("the length must be odd, please re-enter");// length is odd like the topic
      input = scanner.next();
    }
    int index = input.length() / 2; // find the index of middle char
    System.out.println(input.charAt((index)));
    scanner.close();// for sure
  }
}
