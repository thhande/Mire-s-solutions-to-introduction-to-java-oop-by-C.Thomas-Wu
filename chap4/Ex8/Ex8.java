package chap4.Ex8;

import java.util.Scanner;

import chap4.Ex7.Temperature;//import the temper class

public class Ex8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter you temp in celcius");
    double tempe = scanner.nextDouble();
    Temperature temperature = new Temperature();
    temperature.setCelsius(tempe);// set the celcius to temperature so it can convert to fah
    System.out.println("the farheit val of your temp is : " + temperature.toFahrenheit());
    scanner.close();
  }
}
