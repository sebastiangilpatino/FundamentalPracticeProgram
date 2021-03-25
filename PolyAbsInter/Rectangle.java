package PolyAbstInter;

public class Rectangle extends ClosedCurve implements IPolygon {
	private double width;
	private double length;

	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return this.width * this.length;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * this.length + 2 * this.width;
	}

}
