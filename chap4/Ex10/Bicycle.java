package chap4.Ex10;

import chap4.Ex11.Student;

class Bicycle {
  // Data Member
  private Student owner;

  // Constructor: Initialzes the data member
  public Bicycle() {
    owner = new Student();
  }

  // Returns the name of this bicycle's owner
  public Student getOwnerName() {
    return owner;
  }

  // Assigns the name of this bicycle's owner
  public void setOwnerName(String name) {
    owner.setName(name);
  }
}

// base Bicycle class
// class Bicycle {
// // Data Member
// private String ownerName;

// // Constructor: Initialzes the data member
// public Bicycle() {
// ownerName = "Unknown";
// }

// // Returns the name of this bicycle's owner
// public String getOwnerName() {
// return ownerName;
// }

// // Assigns the name of this bicycle's owner
// public void setOwnerName(String name) {
// ownerName = name:
// }
// }