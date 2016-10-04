/**
 * file: Drive_Proj1.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: project 1
 * due date: October 4,2016
 * version: 1.0
 */
import java.util.Scanner;
import java.io.*;

public class Driver_Proj1 {
  public static void main(String[] args) {
    Scanner scanFile = new Scanner(System.in);
    // write your code here
    System.out.println("Please enter 3 integers for array p");
    double [] p = new int[3];
    System.out.println("Please enter 3 integers for array r");    
    double [] r = new int[3];
    for(int i=0; i<p.length; i++)
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here
    for(int j = 0; j<p.length; j++)
    {
      int neighbour = i + j -(r.length / 2);
      if(neighbour >=0 && neighbour < p.length)
      {
        int pValue = p[neighbour];
        int rValue = r[j];
        outputValue += pValue * rValue;
          
        System.out.println("p["+neighbour+"] and r["+j+"]");  
      }
      output[i] = outputValue;
    }
    return output;  
  }
}