Create an interface Polygon, and place it in your project. 
Make the Square, Triangle, and Rectangle classes implement Polygon. Polygon should have two methods:
		public int getNumberOfSides();
		public double computePerimeter();

(Recall that the perimeter of a polygon is the sum of the lengths of its sides.)
	
Note: Each of these figures can still inherit from ClosedCurve and implement the interface. 
The implements statement simply follows the extends statement in the declaration:
class A extends B implements C
Create a Test2 class that works like Test, with Polygon in place of ClosedCurve, with these changes:

Start with an array of Polygons – one Rectangle, one Triangle, one Square. Use these dimensions:
	Rectangle:  width = 3, length = 4
	Triangle: sides are 4,5,6
	Square: side = 3
