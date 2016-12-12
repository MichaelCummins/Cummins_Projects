/**
 * file: smallN.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22,2016
 * version: 1.0
 */
public class SmallN {
  public static void main(String[] args) {
    int n = 0;
    while (Math.pow(n, 2) < 12000) {
      n++; 
  }
  System.out.println("The smallest integer n such that n^2 is greater than 12,000: "+ n);
  }
}