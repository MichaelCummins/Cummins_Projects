/**
 * file: monetary.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;
public class monetary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, I.E 11.56: ");
        String amountS = input.nextLine();
        int amount;

        int pos = amountS.indexOf('.');

        if (pos == -1) {
            amount = Integer.parseInt(amountS);
        } else {
            System.out.println("Ill help you with that");
            String dollars = amountS.substring(0, pos);
            String cents   = amountS.substring(pos + 1);

            System.out.println(dollars);
            System.out.println(cents);
            switch (cents.length()) {
                case 1: cents += "0"; break;
                case 2: cents = cents.substring(0,2); break;
                    default:  cents += "00";
            }
            amount = Integer.parseInt(dollars +cents);
            System.out.println(Integer.parseInt(dollars + cents));
        }

      int remainingAmount = amount;

      int Dollars = remainingAmount / 100;
      remainingAmount = remainingAmount % 100;

      int Quarters = remainingAmount / 25;
      remainingAmount = remainingAmount % 25;

  
      int Dimes = remainingAmount / 10;
      remainingAmount = remainingAmount % 10;

  
      int Nickels = remainingAmount / 5;
      remainingAmount = remainingAmount % 5;


      int Pennies = remainingAmount;

    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + Dollars + " dollars");
    System.out.println("    " + Quarters + " quarters ");
    System.out.println("    " + Dimes + " dimes");
    System.out.println("    " + Nickels + " nickels");
    System.out.println("    " + Pennies + " pennies");
  }
}