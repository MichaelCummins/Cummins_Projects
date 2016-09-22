/**
 * file: countPosNeg.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22,2016
 * version: 1.0
 */
import java.util.Scanner;

public class CountPosNeg{
  public static void main(String[] args){
      System.out.println("Enter an integer, the input ends if it is 0: ");
    Scanner input= new Scanner(System.in);
    int pos= 0;
    int neg= 0;
    double tot = 0;
    int count = 0;
    int num=input.nextInt();
      
    if(num==0){
      System.out.println("The only integer entered is 0");
      System.exit(1);
    }
    
    do{
      if(num>0)
        pos++;
      else
        neg++;
      num = input.nextInt();
    }  
    while(num!=0){
      avg=tot/((double)pos+neg);
      tot += num;
      count++;
      num=input.nextInt();
    }
      
      System.out.println(
      "The number of positives is " + pos +
      "\nThe number of negatives is " + neg +
      "\nThe total is total " + tot +
      "\nThe average is " + avg);
  }
}