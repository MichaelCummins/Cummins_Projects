/**
 * file: BubbleSort.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 5
 * due date: October 6,2016
 * version: 1.0
 */
import java.util.Scanner;
public class BubbleSort {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    double[] numbers = new double[10]; 
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < numbers.length; i++)
      numbers[i] = input.nextDouble();
    bubbleSort(numbers);
    for (double e: numbers) {
      System.out.print(e + " ");
    }
      System.out.println();
	}
    
	/** Sorting method */
  public static void bubbleSort(double[] list) {
    double temp;
    boolean swapped;
    do {
      swapped = false; 
      for (int i = 0; i < list.length - 1; i++) {
      // swapping values
        if (list[i] > list[i + 1]) {
        temp = list[i];
        list[i] = list[i + 1];
        list[i + 1] = temp;
        swapped = true;
         }
       }
     } while (swapped); // Repeat if a value was swapped
  }
}