package chap3;

import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    final double ME = 5.98e24; // Mass of Earth (kg)
    final double G = 6.67e-11; // Gravitational constant (m^3 / (kg * s^2))

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the distance from the center of the Earth (meters): ");
    double r = sc.nextDouble();

    double velocity = Math.sqrt((G * ME) / r);

    System.out.println("The satellite's velocity is: " + velocity + " m/s");

    sc.close();
  }
}
