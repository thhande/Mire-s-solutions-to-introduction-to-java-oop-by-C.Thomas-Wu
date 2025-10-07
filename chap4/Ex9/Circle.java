package chap4.Ex9;

public class Circle {
  private float radius;

  public Circle(float _radius) { // set the radius in the constructor
    radius = _radius;
  }

  public double area() {
    return radius * radius * Math.PI;
  }

  public double circumference() {
    return 2 * radius * Math.PI;
  }
}
