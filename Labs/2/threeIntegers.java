/**
 * file: threeIntegers.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 14,2016
 * version: 1.0
 */

import java.util.Scanner;
public class threeIntegers{
  public static void main(String[] args){
     Scanner input= new Scanner(System.in);
      System.out.println("Enter three integers");
      
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
      
if (number1 > number2 && number1 > number3)
    {
      if (number2 > number3)
      {
      System.out.println(number3 + " " + number2 + " " + number1);
      }
      else
      {
      System.out.println(number2 + " " + number3 + " " + number1);
      }
    }
 else if (number2 > number1 && number2 > number3)
    {
      if (number1 > number3)
      {
      System.out.println(number3 + " " + number1 + " " + number2);
      }
      else
      {
      System.out.println(number1 + " " + number3 + " " + number2);
      }
    }
 else if (number3 > number1 && number3 > number2)
    {
      if (number1 > number2)
      {
      System.out.println(number2 + " " + number1 + " " + number3);
      }
      else
      {
      System.out.println(number1 + " " + number2 + " " + number3);
      }
    }
 else
    {
      System.out.println("error");
    }
  }
}