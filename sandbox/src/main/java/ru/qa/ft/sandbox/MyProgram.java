package ru.qa.ft.sandbox;

public class MyProgram {

	public static void main (String[] arg) {
		hello("world");
		hello("user");
		hello("Elena");

		double l = 3;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

		double a = 4;
		double b = 5;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello (String object) {
		System.out.println("Hello, " + object + "!");
	}

	public static double area (double l) {
		return l * l;
	}

	public static double area (double a, double b) {
		return a * b;
	}
}