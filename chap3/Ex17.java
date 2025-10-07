package chap3;

import java.util.Scanner; //calculate age on earth

public class Ex17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter your age on earth");
    double earthAge = input.nextDouble();

    double mercuryAge = earthAge * 365 / 88;
    double venusAge = earthAge * 365 / 225;
    double jupiterAge = earthAge * 365 / 4380;
    double saturnAge = earthAge * 365 / 10767;

    System.out.println("\nyour age in other planet:");
    System.out.printf("Mercury: %.2f \n", mercuryAge);
    System.out.printf("Venus: %.2f \n", venusAge);
    System.out.printf("Jupiter: %.2f \n", jupiterAge);
    System.out.printf("Saturn: %.2f \n", saturnAge);

    input.close();
  }
}
