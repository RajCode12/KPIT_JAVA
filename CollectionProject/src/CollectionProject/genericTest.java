package CollectionProject;
public class genericTest {
	public static void main(String[] args) {
		AnyPair<Integer> p1 = new AnyPair<Integer>(10,20);
		System.out.println(p1);
		p1.swap();
		System.out.println(p1);
		
	}
}
//class is loading its own code based on the value of t at compile time
class AnyPair<T> {
	private T a;
	private T b;
	public AnyPair(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	//swap code
	public void swap() {
		T temp = a;
		a = b;
		b = temp;
	}
	@Override
	public String toString() {
		return "AnyPair [a=" + a + ", b=" + b + "]";
	}
}
