package chap4.Ex7;

public class Temperature {
  private double fahrenheit; // internal storage in Fahrenheit

  // Mutator: set in Fahrenheit
  public void setFahrenheit(double f) {
    fahrenheit = f;
  }

  // Mutator: set in Celsius (convert to Fahrenheit internally)
  public void setCelsius(double c) {
    fahrenheit = c * 9.0 / 5.0 + 32.0;
  }

  // Accessor: get in Fahrenheit
  public double toFahrenheit() {
    return fahrenheit;
  }

  // Accessor: get in Celsius
  public double toCelsius() {
    return (fahrenheit - 32.0) * 5.0 / 9.0;
  }
}