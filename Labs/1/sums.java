/**
 * file: sums.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7,2016
 * version: 1.0
 */
import java.util.Scanner;


// == classes should start with an upper case letter
public class sums{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000:");
    int number1 = input.nextInt();
    int number2 = input.nextInt(); // == this is wrong, you should 
                                   //    receive only one number, 
                                   //    which you did in the previous 
                                   //    line
    int number3 = input.nextInt();
      
      
    double total = (number1 + number2 + number3);
      
      
    System.out.println("The sum of the digits is "+total);     
  }
}
