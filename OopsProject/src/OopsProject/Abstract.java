package OopsProject;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
abstract class GeometricalShape {
	abstract void area();
	abstract void draw();
	void display() {}
}
// if geometrical shape is abstract - it mandates that child class 
//should also define the abstract method of geometrical class.
class Square extends GeometricalShape {
	void area() {}
	void draw() {}
}