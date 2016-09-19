/**
 * file: pattern.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7,2016
 * version: 1.0
 */
// == classes should start with an upper case letter
public class pattern{
  public static void main(String[] args){
    String j ="J";
    String a ="A";
    String v ="V";
    System.out.println("  "+j+"  "+a+"   "+v+"     "+v+"      "+a);
    System.out.println("  "+j+"  "+a+""+a+"   "+v+"   "+v+"      "+a+""+a);
    System.out.println(""+j+ " "+j+" "+a+a+a+a+"   "+v+" "+v+"      "+a+a+a+a);
    System.out.println(""+j+j+"  "+a+"  "+a+"    "+v+"       "+a+"  "+a);
  }
}
