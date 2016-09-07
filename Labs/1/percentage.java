/**
 * file: percentage.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7,2016
 * version: 1.0
 */
import java.util.scanner;


public class sums{
  public static void main(String[] args){
  System.out.println("Please enter the following as percentage...");
  
  System.out.println("Midterm exam: ");
  double midterm = input.nextDouble;
      
  System.out.println("Final exam: ");
  double fin = input.nextDouble;
      
  System.out.println("Projects: ");
  double projects = input.nextDouble;
      
  System.out.println("Homework and labs: ");
  double homework = input.nextDouble;
       
  double grade =((midterm+fin+projects+homework)/4);  
      
  System.out.println("Your final grade is: "+grade+"%");
  }
}