package OopsProject;

public class StaticTest {

	public static void main(String[] args) {
		//we cannot specify static var inside main method
		//static int val = 10;
		
		Circle circle = new Circle(5);
		circle.calculateArea();
		circle.calculatePerimeter();

		
		//static methods can only call static method or data members
		//non-static methods can call both static and non-static.
		
	}
}
// no static class exist.
class Circle {
	int radius;
	// if pi is final -> it will be created every time in heap memory whenever the method is called.
	//final float pi = 3.14f;
	//make pi static and only one copy of pi is used inside the class
	static float pi = 3.14f;
	Circle(int radius) {
		super();
		this.radius = radius;
	}
	// Note:- we cannot use this keyword in static methods
	void calculateArea() {
		float area = pi * radius * radius;
		System.out.println("Area of circle : " + area);
	}
	void calculatePerimeter() {
		float perimeter = 2 * pi * radius;
		System.out.println("Perimeter of circle : " + perimeter);
	}
}
