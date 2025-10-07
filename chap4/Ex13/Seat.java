package chap4.Ex13;

public class Seat {
  private float pricePerSeat;
  private int numberOfSeats;
  private String type;

  public Seat(float _price, int _seats, String _type) {
    pricePerSeat = _price;
    numberOfSeats = _seats;
    type = _type;
  }

  public float tolSales() {
    return pricePerSeat * numberOfSeats;
  }

  public String getType() {
    return type;
  }

}
