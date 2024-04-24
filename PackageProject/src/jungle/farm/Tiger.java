package jungle.farm;

public class Tiger {
	int defaultA = 10;
	public int publicB = 20;
	protected int protectedC = 30;
	private int privateD = 40;
	void show() {
		System.out.println("defaultA : " + defaultA);
		System.out.println("publicB : " + publicB);
		System.out.println("protectedC : " + protectedC);
		System.out.println("privateD : " + privateD);
	}
}
// if tiger have a child class and in the same package
// it can access default, protected, public

// if tiger have a child class and in the different package
// it can access 