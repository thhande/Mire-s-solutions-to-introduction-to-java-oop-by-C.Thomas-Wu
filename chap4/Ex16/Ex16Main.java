package chap4.Ex16;

public class Ex16Main {
  public static void main(String[] args) {
    // Example input
    int numberOfBags = 32;
    double bagWeight = 5.0;

    // Create CoffeeBag object
    CoffeeBag order = new CoffeeBag(bagWeight, numberOfBags);
    // Display results
    System.out.println("Number of bags sold: " + order.getNumberOfBags());
    System.out.println("Weight per bag: " + order.getBagWeight() + " lb");
    System.out.printf("Price per pound: $%.2f%n", CoffeeBag.PRICE_PER_LB);
    System.out.printf("Sales tax: %.2f%%%n", CoffeeBag.TAX_RATE * 100);
    System.out.printf("Total price: $%.2f%n", order.getTotalPriceWithTax());
  }
}
