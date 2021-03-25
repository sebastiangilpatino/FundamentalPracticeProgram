package PolyAbstInter;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 7), new Circle(3) };
		// compute areas
		for (ClosedCurve cc : objects) {
			System.out.print("The Area of this " + cc.getName() + " is: ");
			System.out.printf("%.2f \n", cc.computeArea());

		}

	}

}