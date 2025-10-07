package chap2;

import javax.swing.JFrame;
import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first name: ");
    String first = sc.nextLine();// first name

    System.out.print("Enter last name: ");
    String last = sc.nextLine();// latst name

    JFrame frame = new JFrame(last + ", " + first); // set title with the entered name
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    sc.close();
  }
}
