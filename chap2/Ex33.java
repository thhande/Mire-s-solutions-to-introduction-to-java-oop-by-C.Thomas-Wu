package chap2;

import galapagos.*;

public class Ex33 {
  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.speed(50);
    t.penUp();
    float mul = 0.5f;

    // Vẽ thanh màu phía trên (nếu cần), ở đây bỏ qua phần màu, chỉ focus chữ:

    // Hello trái trên
    t.move(-100 * mul);
    t.turn(90);
    t.move(-50 * mul);
    t.turn(-90);
    t.print("Hello");

    // Hello phải trên
    t.penUp();
    t.move(200 * mul);
    t.print("Hello");

    // Hello giữa
    t.penUp();
    t.move(-100 * mul);
    t.turn(-90);
    t.move(100 * mul);
    t.turn(90);
    t.print("Hello");

    // Hello trái dưới
    t.penUp();
    t.move(-100 * mul);
    t.turn(-90);
    t.move(100 * mul);
    t.turn(90);
    t.print("Hello");

    // Hello phải dưới
    t.penUp();
    t.move(200 * mul);
    t.print("Hello");
  }
}
