package AreaFigures;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Area rectangle = new Rectangle(10, 10);
		Area triangle = new Triangle(10, 5);

		Circle circle = new Circle(12, "cir", new Date());
		Circle circle2 = (Circle) circle.clone();
		Circle circle3 = circle;

		System.out.println("\n" + "Original " + circle.getDate());
		circle2.setDate(new Date(123456789));
		System.out.println("\n" + "Original after Set " + circle.getDate());
		System.out.println("\n" + "Circle2 " + circle2.getDate());
		System.out.println("\n" + "Circle3 " + circle3.getDate());

		// System.out.println("Area of rectangle is: " + rectangle.computeArea());
		// System.out.println("Area of triangle is: " + triangle.computeArea());
		// System.out.println("Area of circle is: " + circle.computeArea());
	}

}
