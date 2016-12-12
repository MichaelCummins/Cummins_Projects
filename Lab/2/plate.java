/**
 * file: plate.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */

public class plate{
    public static void main(String[] args) {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < 3; i++) {
        char ch = (char)(Math.random()*26 + 'A');
        s.append(ch);
    }
      for (int i = 0; i < 4; i++) {
        char digit1 = (char)(Math.random() * 10 + '0');
        s.append(digit1);
    }
    System.out.println("Random vehicle plate number: " + s);
  }
}