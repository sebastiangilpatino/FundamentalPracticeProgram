package AreaFigures;

import java.util.Date;

public class Circle implements Area, Cloneable {
	private double radius;
	private String name;
	private Date date;

	public Circle(double radius, String name, Date fecha) {
		this.radius = radius;
		this.name = name;
		this.date = fecha;
	}

	public void setDate(Date fecha) {
		this.date = fecha;
	}

	public Date getDate() {
		return date;
	}

	public String getName() {
		return name;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	public Object clone() throws CloneNotSupportedException {
		Circle c = (Circle) super.clone();
		// c.date = (Date) date.clone();
		return c;
	}

}
