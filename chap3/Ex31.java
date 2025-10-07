package chap3;

import java.util.Scanner;
import galapagos.*;

public class Ex31 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Input 5 values ---
    int[] values = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter value " + (i + 1) + ": ");
      values[i] = sc.nextInt();
    }

    // --- Step 2: Create a Turtle and set speed ---
    Turtle t = new Turtle();
    t.speed(100); // make it draw faster

    // --- Step 3: Draw axes ---
    t.penUp();
    t.moveTo(-200, -150); // start at bottom left
    t.penDown();
    t.moveTo(200, -150); // x-axis
    t.moveTo(-200, -150); // back to origin
    t.moveTo(-200, 150); // y-axis

    // --- Step 4: Draw bars ---
    int barWidth = 50;
    int spacing = 20;
    int xStart = -180; // starting x position for first bar

    for (int i = 0; i < values.length; i++) {
      int height = values[i];

      // Move to bottom of bar
      t.penUp();
      t.moveTo(xStart + i * (barWidth + spacing), -150);
      t.penDown();

      // Draw rectangle for bar
      t.moveTo(xStart + i * (barWidth + spacing), -150 + height);
      t.moveTo(xStart + i * (barWidth + spacing) + barWidth, -150 + height);
      t.moveTo(xStart + i * (barWidth + spacing) + barWidth, -150);
      t.moveTo(xStart + i * (barWidth + spacing), -150);

      // Optionally: label the bar value above it
      t.penUp();
      t.moveTo(xStart + i * (barWidth + spacing) + barWidth / 2, -150 + height + 15);
      t.print(String.valueOf(height));
    }

    sc.close();
  }
}
