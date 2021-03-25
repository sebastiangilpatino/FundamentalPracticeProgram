package AreaFigures;

public class Triangle implements Area {
	private double base;
	private double heigth;

	public Triangle(double base, double height) {
		this.base = base;
		this.heigth = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeigth() {
		return heigth;
	}

	@Override
	public double computeArea() {
		return (base * heigth) / 2;
	}

}
