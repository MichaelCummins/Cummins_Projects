/**
 * file: hexagon.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;

public class hexagon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of 1 side of the Hexagon ");
      int n = input.nextInt();
    // Calculate the area based on formula
      double area = (6 * Math.pow(6, 2)) / (4 * Math.tan(Math.PI / 6));
    //Print result
      System.out.println ("Area of regular hexagon is " + area);
  }
}