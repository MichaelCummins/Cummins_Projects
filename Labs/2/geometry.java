/**
 * file: Geometry.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;
public class Geometry {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of 1 side of the Pentagon ");
    int n = input.nextInt();
    // Calculate the area based on formula
    double area = (n * Math.pow(n, 2)) / (4 * Math.tan(Math.PI / n));
    //Print result
    System.out.println ("Area of regular pentagon is " + area);
  }
}