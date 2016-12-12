/**
 * file: SelectionSort.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 5
 * due date: October 6,2016
 * version: 1.0
 */
 import java.util.Scanner;

public class SelectionSort {
  // Main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10]; // Create an array of length 10
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < numbers.length ; i++)
      numbers[i] = input.nextDouble();
    // Call SelectionSort method
    selectionSort(numbers);
    // Display the sorted numbers
    for (double e: numbers) 
      System.out.print(e + " ");
      System.out.println();
	}
	// Sorts array in ascending order 
  public static void selectionSort(double[] list) {
    for (int i = list.length - 1; i >= 0; i--) {
    // Find max of list
    double currentMax = list[i];
    int currentMaxIndex = i;
	for (int j = i - 1; j >= 0; j--) {
      if (currentMax < list[j]) {
        currentMax = list[j];
        currentMaxIndex = j;
      }
    }
    // Swap list[i] with list[currentMax]
    if (currentMaxIndex != i) {
      list[currentMaxIndex] = list[i];
      list[i] = currentMax;
      }
    }
  }
}