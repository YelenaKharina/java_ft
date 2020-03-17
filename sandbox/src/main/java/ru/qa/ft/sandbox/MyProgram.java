package ru.qa.ft.sandbox;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class MyProgram {

	public static void main (String[] arg) {
		hello("world");
		hello("user");
		hello("Elena");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
}

	public static void hello (String object) {
		System.out.println("Hello, " + object + "!");
	}
}