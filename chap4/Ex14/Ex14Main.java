package chap4.Ex14;

import java.util.Scanner;

public class Ex14Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("input your earth weight: "); // input weight on earth
    double earthWeight = input.nextDouble();

    WeightConverter mercuryWeight = new WeightConverter(0.4);
    WeightConverter venusWeight = new WeightConverter(0.9);
    WeightConverter jupiterWeight = new WeightConverter(2.5); // multiply to cal the weight on other planet
    WeightConverter saturnWeight = new WeightConverter(2.5);

    System.out.printf("Mercury: %.2f kg\n", mercuryWeight.convert(earthWeight));
    System.out.printf("Venus: %.2f kg\n", venusWeight.convert(earthWeight)); // print out the result
    System.out.printf("Jupiter: %.2f kg\n", jupiterWeight.convert(earthWeight));
    System.out.printf("Saturn: %.2f kg\n", saturnWeight.convert(earthWeight));

    input.close();
  }
}
