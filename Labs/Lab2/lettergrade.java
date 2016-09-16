/**
 * file: lettergrade.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;
public class lettergrade{
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter the following as percentage...");
  
    System.out.println("Midterm exam: ");
    int midterm = input.nextInt();
      
    System.out.println("Final exam: ");
    int fin = input.nextInt();
      
    System.out.println("Projects: ");
    int projects = input.nextInt();
      
    System.out.println("Homework and labs: ");
    int homework = input.nextInt();
       
    int grade =((midterm+fin+projects+homework)/4);
    
    switch(grade){
        case 0:
            if(grade <= 100 && grade >= 90)
            {
            System.out.println("A");break;
            }
        case 1: 
            if(grade <= 89.99 && grade >= 80)
            {
            System.out.println("B");break;
            }
        case 2:
            if(grade <= 79.99 && grade >= 70)
            {
            System.out.println("C");break;
            }
        case 3:
            if(grade <= 69.99 && grade >= 60)
            {
            System.out.println("D");break;
          }
        default:
        {
        System.out.println("F");break;
      }
    }
  }
}