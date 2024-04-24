package exception;

public class ExceptionTest {
		public static void main(String[] args) {
			int num1 = 10, num2 = 4;
			System.out.println("num1 : " + num1);
			System.out.println("num2 : " + num2);
			//Exception at run time if num2 = 0 -> arithmetic
			//System.out.println(num1 + "divided by " + num2 + " is : " + num1/num2);
			
			//first method
			if(num2 == 0) {
				throw new ArithmeticException("Cannot divide by 0");
			} else {
				System.out.println(num1 + " divided by " + num2 + " is : " + num1/num2);
			}
			
			//second method
			try {
				int a = 10, b = 0;
				System.out.println(a/b);
			} catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
			} catch(RuntimeException e) {
				System.out.println(e);
			} catch(Exception e) {
				System.out.println(e);
			} catch(Throwable e) {
				System.out.println(e);
			} finally {
				System.out.println("Done");
			}
			
			//order should be always from low to high
			//we cannot write Arithmetic after Runtime Exception
			System.out.println("*************************");
			Dog dog = new Dog("Tommy",12);
			System.out.println(dog);
		}
}
class Dog {
	String name;
	int age;
	Dog(String name, int age) {
		this.name = name;
		System.out.println("Constructor started");
		if(age > 14) {
			throw new RuntimeException("Dog's age cannot be greater than 14");
		} else if(age <= 0) {
			throw new RuntimeException("Dog's age cannot be less than 0");
		} else {
			this.age = age;
		}
		System.out.println("Constructor finished");
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	//In user defined exception, set the limit inside the constructor
	// If the constructor gets fail, the data allocated by new 
	// keyword will be rolled back.
 }
