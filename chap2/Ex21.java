package chap2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex21 {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now(); // just like ex20 but other type of format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM d, yyyy");
    System.out.println(today.format(formatter));
  }
}
