package jungle.river;

// import package for Class to work
import jungle.farm.Tiger;

public class Fish{
	Tiger tiger = new Tiger();
	public void swim() {
//		System.out.println("defaultA : " + tiger.defaultA);
		System.out.println("publicB : " + tiger.publicB);
//		System.out.println("protectedC : " + tiger.protectedC);
//		System.out.println("privateD : " + tiger.privateD);
		
		// only public is visible outside of the package
	}
}
