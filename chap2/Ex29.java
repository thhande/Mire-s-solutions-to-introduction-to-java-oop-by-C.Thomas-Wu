package chap2;

import java.util.Scanner;

import galapagos.*;

public class Ex29 {
  public static void main(String[] args) {
    Turtle turtle = new Turtle(); // the topic just say the triangle so i will choose easy path: draw an
    // equilateral triangle with side length equal to 3
    Scanner scanner = new Scanner(System.in);
    int edge = scanner.nextInt();
    turtle.move(edge);// draw the first edge
    turtle.turn(120);// turn 120 degrees as 180 - 120 = 60
    turtle.move(edge);
    turtle.turn(120);
    turtle.move(edge);
    scanner.close();
  }
}
