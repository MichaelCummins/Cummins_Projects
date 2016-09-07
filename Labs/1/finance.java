/**
 * file: finance.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7,2016
 * version: 1.0
 */
import java.util.scanner;


public class finance{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
      
  System.out.println("Enter the subtotal and a gratuity rate: ");
  double subtotal = input.nextDouble(); 
  double gratuity = input.nextDouble();

      
  //compute total
  double newGratuity = (gratuity/subtotal); 
  double total = (newGratuity+subtotal);
  
  //results
  System.out.println("The gratuity is $"+newGratuity +"and the total is "+total);  
  }
}