/**
 * file: Rectangle.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 6
 * due date: October 20,2016
 * version: 1.0
 */
public class Rectangle {
  double width;	// Width of rectangle
  double height;	// Height of rectangle
  Rectangle() {
    width = 1;
    height = 1;
  }
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  double getArea() {
    return width * height; 
  }
  double getPerimeter() {
    return 2 * (width + height);
  }
}