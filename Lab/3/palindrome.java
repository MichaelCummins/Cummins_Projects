/**
 * file: digits.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22,2016
 * version: 1.0
 */
import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number = input.nextInt();
    System.out.println(number (isPaldindrome(num)?" is ":" is not ")+"a palindrome");
  }
  public static boolean isPalindrome(int number){
    return number == reverse(num)? true: false;
  }
  public static int reverse(int number){
    String reverse ="";
    String n = num + "";
    for (int i=n.length()-1;i>=0;i--){
      reverse += n.charAt(i);
  }
  return Integer.parseInt(reverse);
  }
}