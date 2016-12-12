/**
 * file: largeN.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22,2016
 * version: 1.0
 */
public class LargeN {
  public static void main(String[] args) {
    int n = 0;
    while (Math.pow(n+1, 3) > 12000) {
      n++; 
  }
  System.out.println(
    "The largest integer n such that n^2 is smaller than 12,000: " + n);
  }
}