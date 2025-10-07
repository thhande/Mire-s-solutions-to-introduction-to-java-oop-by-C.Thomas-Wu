package chap2;

import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter your string");
    String input = scanner.nextLine();
    System.out.println(input.length());// show the length of string
    System.out.println(input.charAt(0));// print the first char
    System.out.println(input.charAt(input.length() - 1));// print the last char
    scanner.close();// close the scanner for sure
  }
}
