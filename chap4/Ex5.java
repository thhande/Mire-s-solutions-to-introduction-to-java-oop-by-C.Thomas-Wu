package chap4;

import java.util.Random;

class Dice {
  public int roll() {
    Random random = new Random();
    return random.nextInt(1, 7);
  }
}

public class Ex5 {
  public static void main(String[] args) {
    Dice dice = new Dice();// create new dice
    // roll the dice three times
    for (int i = 0; i < 3; i++) {
      System.out.println("it: " + i + 1 + " : " + dice.roll());// print the output
    }

  }
}
