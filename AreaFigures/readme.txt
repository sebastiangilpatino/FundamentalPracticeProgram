Create Java classes for Triangle, Rectangle, and Circle. Provide each class with a method 

public double computeArea()

Provide one constructor for each class; the constructor should accept the data necessary to specify the figure, 
and to compute its area. The values accepted by the constructor should be stored in instance fields of the class.
For example, Rectangle should have instance fields width and length, and the constructor should look like this

public Rectangle(double width, double length)

Whenever you create instance fields for one of these classes, provide public accessors for them (but do not provide
mutators – the dimensions of a Rectangle should be read-only!). For example, you will have in the Rectangle class:

	private double width;
	
	public double getWidth() {
		return width;
	}

Create a fourth class Main that will, in its main method, test these three figure classes as follows: It will create 
one instance of each (you can make your own choice for the dimensions of your figures) and then print to the console the area of each. 
Typical output would be:

	Area of Triangle is 34.75
	Area of Rectangle is 36.0
	Area of Circle is 58.57

Here are some area formulas, in case you do not remember them:

	Area of a rectangle  =  width * height
	Area of a triangle = 1/2 * base * height
	Area of a circle = PI * radius * radius

