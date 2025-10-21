package chap4.Ex15;

public class Bag {
  private int boxes;
  private double boxPrice;

  public int getBoxes() {
    return boxes;
  }

  public double getBoxPrice() {
    return boxPrice;
  }

  public void setBoxes(int boxes) {
    this.boxes = boxes;
  }

  public void setBoxPrice(double boxPrice) {
    this.boxPrice = boxPrice;
  }

  public Bag(int boxes, double boxPrice) {
    this.boxes = boxes;
    this.boxPrice = boxPrice;
  }

  public double getBagPrice() {
    return boxPrice * boxes;
  }
}
