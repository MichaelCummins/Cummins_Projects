/**
 * file: conversion.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7,2016
 * version: 1.0
 */
import java.util.Scanner;

// == classes should start with an upper case letter
public class conversion{
  public static void main(String[] args){ 
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a degree in Celsius ");
    
    double temperature = input.nextDouble();
    
    double newTemperature =((9.0/5.0)*temperature+32);
    System.out.println(temperature +" Celsius is "+newTemperature+" Fahrenheit");
  }
}