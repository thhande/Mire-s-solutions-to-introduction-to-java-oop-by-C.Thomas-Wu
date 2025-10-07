package chap2;

import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first name: ");
    String first = sc.nextLine();

    System.out.print("Enter middle name: ");
    String middle = sc.nextLine();

    System.out.print("Enter last name: ");
    String last = sc.nextLine();

    // Lấy ký tự đầu middle và thêm dấu chấm
    char middleInitial = middle.charAt(0);

    System.out.println(first + " " + middleInitial + ". " + last);

    sc.close();
  }
}
