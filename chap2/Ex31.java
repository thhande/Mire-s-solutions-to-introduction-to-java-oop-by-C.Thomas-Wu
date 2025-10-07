package chap2;

import galapagos.Turtle;

public class Ex31 {
  public static void main(String args[]) {
    Turtle t = new Turtle();
    int arcSegments = 12; // số đoạn nhỏ để tạo cong
    int arcStepLength = 8; // độ dài mỗi đoạn cong (tùy chỉnh)
    int arcTurn = 180 / arcSegments; // tổng 180 độ/segments (nửa vòng)
    // draw horizontal line
    t.move(70);
    t.turn(180);
    t.move(35);

    // draw vertical line
    t.turn(90);
    t.move(80);

    // draw half circle
    // fuck, i have to use math
    for (int i = 0; i < arcSegments; i++) {
      t.move(arcStepLength);
      t.turn(360 - arcTurn); // nhỏ góc để cong mượt
    }

  }
}
