package chap4.Ex14;

public class WeightConverter {
  private double mulValue;

  public WeightConverter(double val) {
    mulValue = val;
  }

  public double convert(double convertValue) { // multiply the value need to convert with the mulValue
    return convertValue * mulValue;
  }
}
