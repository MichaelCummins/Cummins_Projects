/**
 * file: SmallestElement.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 4
 * due date: September 28,2016
 * version: 1.0
 */
import java.util.Scanner;

public class SmallestElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner
    double[] numbers = new double[10]; // Create array of length 10
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
          numbers[i] = input.nextDouble();
      }
    System.out.println("The minimum number is: " + min(numbers));
    }
  public static double min(double[] array) {
    double min = array[0];	// Minimum value
      for (double i: array) {
      if (i < min)
      min = i;
    }
    return min;
  }
}