package chap3;

import java.util.Scanner; //calculate weight in other planet

public class Ex16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("input your earth weight: "); // input weight on earth
    double earthWeight = input.nextDouble();

    double mercuryWeight = earthWeight * 0.4;
    double venusWeight = earthWeight * 0.9;
    double jupiterWeight = earthWeight * 2.5; // multiply to cal the weight on other planet
    double saturnWeight = earthWeight * 1.1;

    System.out.printf("Mercury: %.2f kg\n", mercuryWeight);
    System.out.printf("Venus: %.2f kg\n", venusWeight); // print out the result
    System.out.printf("Jupiter: %.2f kg\n", jupiterWeight);
    System.out.printf("Saturn: %.2f kg\n", saturnWeight);

    input.close();
  }
}
