package chap4.Ex11;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class LibraryCard {
  // Data Members
  // student owner of this card
  private Student owner;
  // number of books borrowed
  private int borrowCnt;
  // exp date
  private GregorianCalendar expDate;

  // Constructor
  public LibraryCard() {
    owner = null;
    borrowCnt = 0;
  }

  // numOfBooks are checked out
  public void checkOut(int numOfBooks) {
    borrowCnt = borrowCnt + numOfBooks;
  }

  // Returns the number of books borrowed
  public int getNumberOfBooks() {
    return borrowCnt;
  }

  // Returns the name of the owner of this card
  public String getOwnerName() {
    return owner.getName();
  }

  // Sets owner of this card to student
  public void setOwner(Student student) {
    owner = student;
  }

  // Returns the string representation of this card
  public String toString() {
    return "Owner Name: " + owner.getName() + "\n" +
        " Email: " + owner.getEmail() + "\n" +
        "Books Borrowed: " + borrowCnt;
  }

  public void setExpDate(GregorianCalendar date) {
    expDate = date;
  }

  public int getExpYear() {
    return expDate.get(Calendar.YEAR);
  }

  public int getExpMonth() {
    return expDate.get(Calendar.MONTH);
  }

  // returns the expiration day
  public int getExpDay() {
    return expDate.get(Calendar.DATE);
  }

}
