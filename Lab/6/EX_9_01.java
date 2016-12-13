/**
 * file: EX9_01.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 6
 * due date: October 20,2016
 * version: 1.0
 */
public class EX_9_01 {
  /** Main method */
  public static void main(String[] args) {
    // Width 4 and height 40
    Rectangle rectangle1 = new Rectangle(4, 40);
    // Width 3.5 and height 35.9
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    // Displays the width, height, area, and perimeter of rectangle1
    System.out.println("\n Rectangle 1");
    System.out.println("-------------");
    System.out.println("Width:     " + rectangle1.width);
    System.out.println("Height:    " + rectangle1.height);
    System.out.println("Area:      " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter());
    // Displays the width, height, area, and perimeter of rectangle2
    System.out.println("\n Rectangle 2");
    System.out.println("-------------");
    System.out.println("Width:     " + rectangle2.width);
    System.out.println("Height:    " + rectangle2.height);
    System.out.println("Area:      " + rectangle2.getArea());
    System.out.println("Perimeter: " + rectangle2.getPerimeter());
  }
}