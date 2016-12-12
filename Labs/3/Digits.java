/**
 * file: digits.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22,2016
 * version: 1.0
 */
import java.util.Scanner;

public class Digits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    long num = input.nextLong();
    System.out.println("the sum of the digits in "+ num +" is "+ sumDigits(num));
  }
  public static long sumDigits(long n){
      int sum = 0;
      while(n>0){
        sum +=n % 10;
        n /= 10;
      }
      return sum;
  }
}