package OopsProject;

public class Constructor {
	public static void main(String[] args) {
		//GrandFather gf = new GrandFather();
		//System.out.println("----------------");
		//Father f = new Father();
		//System.out.println("----------------");
		
		Child c = new Child();
		// all three statement will get printed because
		// child is calling the super keyword to father class
		// father is calling the super keyword to grandfather class
		// even if we do not write the super keyword
	}
}
// every class has default constructor that has no argument - implicit constructor
// the moment we declare any constructor - no default constructor now

// super.balance() -> used to call data fields or methods 
// super() -> used to define parent class constructor

class GrandFather {
	GrandFather(int i, int j, int k) {
		System.out.println("GrandFather()....");
	}
	GrandFather() { }
}
class Father extends GrandFather {
	Father() {
		super(10,20,30);
		System.out.println("Father()....");
	}
	
}
class Child extends Father {
	Child() {
		System.out.println("Child()....");
		//super keyword must be the first statement in a constructor

	}
	
}
