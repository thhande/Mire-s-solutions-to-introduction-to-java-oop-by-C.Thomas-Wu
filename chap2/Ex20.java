package chap2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex20 {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();// get date and time
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");// format the local date
    System.out.println(today.format(formatter));
  }
}
