package jungle.farm;

public class WhiteTiger extends Tiger{
	Tiger tiger = new Tiger();
	//Accessing using reference 'tiger'
	void display() {
		System.out.println("defaultA : " + tiger.defaultA);
		System.out.println("publicB : " + tiger.publicB);
		System.out.println("protectedC : " + tiger.protectedC);
		//System.out.println("privateD : " + tiger.privateD);
		// cannot access the private method even if it is the 
		// the child class of tiger OR in the same package
		
	}
}
