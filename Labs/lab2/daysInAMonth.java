/**
 * file: daysInAMonth.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;

public class daysInAMonth{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a month and a year");
        int month = input.nextInt();
        double year = input.nextDouble();
          switch(month){
            case 0: System.out.println("31");break;
            case 1:
                if(year / 4 == 0){
                  System.out.println("29");break;
              } else{
                  System.out.println("28");break;
              }
            case 2: System.out.println("31");break;
            case 3: System.out.println("30");break;
            case 4: System.out.println("31");break;
            case 5: System.out.println("30");break;
            case 6: System.out.println("31");break;
            case 7: System.out.println("31");break;
            case 8: System.out.println("30");break;
            case 9: System.out.println("31");break;
            case 10:System.out.println("30");break;
            case 11:System.out.println("31");break;
    }
  }
}