package chap2;

import galapagos.*;

public class Ex32 {
  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.speed(50); // nếu thư viện hỗ trợ tăng tốc

    drawRectangle(t, 200, 150);
    shift(t, 30, 25); // dịch vào giữa một chút
    drawRectangle(t, 140, 100);
    shift(t, 30, 25);
    drawRectangle(t, 80, 50);
  }

  // Vẽ hình chữ nhật, turtle đang hướng sang phải
  public static void drawRectangle(Turtle t, int width, int height) {
    t.penDown();
    for (int i = 0; i < 2; i++) {
      t.move(width);
      t.turn(90);
      t.move(height);
      t.turn(90);
    }
  }

  // Dịch turtle vào trong, không vẽ
  public static void shift(Turtle t, int dx, int dy) {
    t.penUp();
    // lùi nửa cạnh trái
    t.move(dx);
    t.turn(90);
    t.move(dy);
    t.turn(-90);
  }
}
