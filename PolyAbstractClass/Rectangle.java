package PolyAbstractClass;

public class Rectangle extends ClosedCurve {
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
	String getName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
