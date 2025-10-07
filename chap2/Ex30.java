package chap2;

import galapagos.Turtle;

public class Ex30 {

  public static void main(String args[]) {
    Turtle t = new Turtle();
    int d = 50;
    for (int i = 0; i < 5; i++) { // draw 5 edge of a star
      t.move(d); // d length of an edge
      t.turn(144);
    }

  }
}
