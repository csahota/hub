package com.java.snippets;

/**
 * Specification: Design and Implement a program that implements the following:
 * - 2D Rectangle Class with floating point coordinates. 
 * - Methods for constructing a Rectangle with initial size and coordinates 
 * - Copy and Assignment constructors/operators - Method in the Class that allows you to
 *   check for collision between two axis-aligned Rectangles. 
 * - Method for testing collision/intersection with a 2D point 
 * - Simple test code that creates instances of your class and tests your implementation Given: 
 * 
 * You can use this class in your implementation. Feel free to modify this class as well.
 * 
 * class Point2D { float x; float y; };
 * 
 * 
 * @author Char Sahota
 * @date Oct. 30, 2019
 *
 */

public class Point2D {

	static class Point {

		float x, y;
	}

	/**
	 * Returns if there is a collision between two rectangles.
	 * 
	 * @param l1
	 * @param r1
	 * @param l2
	 * @param r2
	 * @return
	 */
	static void doRectanglesCollide(Point l1, Point r1, Point l2, Point r2) {
		
		// Check if one rectangle is on the left of the other
		if (l1.x > r2.x || l2.x > r1.x) {
			System.out.println("Rectangles do not collide");
			return;
		}

		// Check if one rectangle is above the other
		if (l1.y < r2.y || l2.y < r1.y) {
			System.out.println("Rectangles do not collide");
			return;
		}

		System.out.println("Rectangles collide");;
	}

	/**
	 * Main method to test the doRectanglesCollide method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Testing a collision
		Point left1 = new Point(), right1 = new Point(), left2 = new Point(), right2 = new Point();
		left1.x = 0;
		left1.y = 9;
		right1.x = 9;
		right1.y = 0;
		left2.x = 3;
		left2.y = 3;
		right2.x = 12;
		right2.y = 2;

		doRectanglesCollide(left1, right1, left2, right2);
		
		// Testing points that do not collide
		left1.x = 0;
		left1.y = 10;
		right1.x = 10;
		right1.y = 0;
		left2.x = 15;
		left2.y = 20;
		right2.x = 20;
		right2.y = 15;
		
		doRectanglesCollide(left1, right1, left2, right2);
		
	}

}
