package com.line;

import java.util.Scanner;

class Point {
	public double x;// co-ordinate x
	public double y;// co-ordinate y
	public static double length;

	public double getX() {
		return x;
	}

	public class LineComparisionComputation {
		static void equalityCheck() {
			double lineLength1 = lineLength();
			double lineLength2 = lineLength();
			if (lineLength1 == lineLength2) {
				System.out.println("equal");
			} else {
				System.out.println("not equal");
			}
		}

		public static double lineLength() {
			Point point = new Point();
			Scanner scanner = new Scanner(System.in);

			System.out.println("enter the value of x1");
			point.setX((scanner.nextInt()));

			double x1 = point.getX();
			System.out.println("enter the value of x2");
			point.setX((scanner.nextInt()));

			double x2 = point.getX();
			System.out.println("enter the value of y1");

			point.setY((scanner.nextInt()));
			double y1 = point.getY();

			System.out.println("enter the value of y2");

			point.setY((scanner.nextInt()));
			double y2 = point.getY();
			double x = Math.pow((x1 - x2), 2);
			return length;
		}

		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation Program using OOPS");
			equalityCheck();

		}

	}

	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setY(int i) {
		// TODO Auto-generated method stub

	}

	public void setX(int i) {
		// TODO Auto-generated method stub

	}
}