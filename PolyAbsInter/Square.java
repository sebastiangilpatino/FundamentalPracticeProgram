package PolyAbstInter;

public class Square extends ClosedCurve implements IPolygon {
	double side;

	public Square(Double side) {
		this(side.doubleValue());
	}

	public Square(double side) {
		this.side = side;
	}

	double computeArea() {
		return (side * side);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Square";
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * this.side;
	}
}