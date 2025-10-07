package chap4.Ex16;

// CoffeeBag.java
public class CoffeeBag {
  // Constants
  public static final double PRICE_PER_LB = 5.99;
  public static final double TAX_RATE = 0.0725; // 7.25%

  // Instance variables
  private double bagWeight; // in pounds
  private int numberOfBags;

  // Constructor
  public CoffeeBag(double bagWeight, int numberOfBags) {
    this.bagWeight = bagWeight;
    this.numberOfBags = numberOfBags;
  }

  // Method to calculate total price before tax
  public double getTotalPrice() {
    return bagWeight * numberOfBags * PRICE_PER_LB;
  }

  // Method to calculate total price including tax
  public double getTotalPriceWithTax() {
    double totalPrice = getTotalPrice();
    return totalPrice + totalPrice * TAX_RATE;
  }

  // Getters
  public double getBagWeight() {
    return bagWeight;
  }

  public int getNumberOfBags() {
    return numberOfBags;
  }
}
