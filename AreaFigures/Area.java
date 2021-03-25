package AreaFigures;

public interface Area {
	public double computeArea();

	static double sumSide(double width, double heigth) {
		return width + heigth;
	}

	default double timeSide(double width, double heigth) {
		return width * heigth;
	}
}
