/**
 * file: ascII.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;

public class ascII{
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter an ASCII code: ");
    int c=(char)input.nextInt;
    char x=c;
      
      
    System.out.println("The character for ASCII code is"+ x);  
  }
}