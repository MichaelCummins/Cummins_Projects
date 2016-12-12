/**
 * file: financeApp.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22,2016
 * version: 1.0
 */
public class FinanceApp{
  public static void main(String[] args){
    int totCost=0;
    int tuition=10000;
    int tuitionTenYears=tuition;
      
    for(int year=1;year<=14;year++){
      tuition +=(tuition * .05);
      if(year > 10)
        totCost +=tuition;
      if(year == 10)
        tuitionTenYears = tuition;
    }
      
    System.out.println("Tuition in ten years: "+ tuitionTenYears);
    System.out.println("Total cost for four years worth of tuiition"+"after the tenth year: "+totCost);
  }
}