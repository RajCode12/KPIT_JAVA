package OopsProject;

public class Interface {

	public static void main(String[] args) {
		
	}
}
// interface - pure form of abstract
// any class that implements interface or method of interface must be abstract
// any class that extends abstract class may or may not be abstract
interface Proactive {
}
class Human2 {
	
}
class Person extends Human2 implements Proactive{
	String gender;
	int age;
	String name;
	Person(String gender, int age, String name) {
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}


// interface -> class == implements
// class -> class, interface -> interface == extends

interface A {
//	abstract void a();
	void b();
}

abstract class B implements A {
	abstract void play();

}
// make every child or sub child class abstract until and unless
// all the method of the interface or abstract class
// not defined in any of the child class.
abstract class C extends B {
	abstract void run();
}
class D extends C {

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
	
}
