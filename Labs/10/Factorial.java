/**
 * file: Factorial.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 10
 * due date: November 17,2016
 * version: 1.0
 */
import java.util.Scanner;
import java.math.*;
public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    String n = input.nextLine();
    System.out.println("Factorial of " + n + " is " + factorial(new BigInteger(n)));
    }
    /** Retrun the factorial for the specified number */
    public static BigInteger factorial(BigInteger n) {
      if (n.equals(BigInteger.ZERO)) // Base case
        return BigInteger.ONE; 
      else // Recursive call
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }
}