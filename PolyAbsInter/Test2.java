package PolyAbstInter;

public class Test2 {

	public static void main(String[] args) {

		IPolygon[] objects = { new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4) };
		// compute areas
		for (IPolygon cc : objects) {
			System.out.println("For this " + cc.getName());
			System.out.println("  Number of sides = " + cc.getNumberOfSides());
			System.out.println("  Perimeter = " + cc.computePerimeter());

		}
	}

}
