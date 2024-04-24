package OopsProject;

public class Polymorphism {
	public static void main(String[] args) {
		Doctor docObj = new Doctor();
		Surgeon surObj = new Surgeon();
		HeartSurgeon heartSurObj = new HeartSurgeon();
		
		MedicalCamp.medicalCheckup(heartSurObj);
//		we can pass any three object because medicalCheckup is 
//		taking Super class "Doctor" as an argument
//		static void medicalCheckup(Surgeon doctor) {}
//		now, we cannot pass the docObj
//		we can only pass the surObj or heartSurgeon or lower
//		
		
		Doctor doc = new Surgeon();
		//doc.doSurgery();
		
//		Doctor docObj = new Surgeon();
//		docObj.doSurgery();
//		it will not work here because doSurgery is not in Doctor
//		even if doSurgery method is present in Surgeon class
//		hence it will  give compile time error
		
//		Note: super class can only call the overridden method of child 
//		it cannot call the specialized method of child
//		specialized - method is not in parent class 
		
		Doctor docObj2 = new Surgeon();
		if(docObj2 instanceof Doctor) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//		 output is Yes because Surgeon is also a doctor
		
		Doctor docObj3 = new HeartSurgeon();
		if(docObj3 instanceof Surgeon) {
			
			Surgeon surObj2 = (Surgeon) docObj3;
			surObj2.doSurgery();
			
			HeartSurgeon heartSurObj2 = (HeartSurgeon) docObj3;
			heartSurObj2.checkECG();
		}
//		Type casting OR dynamic method dispatch
//		Here, docObj3 is instance of surgeon because HeartSurgeon extends Surgeon
//		 Now docObj2.doSurgery() will work because of type casting
//		 Note:- Never do type casting without if condition
		
	}
}
class MedicalCamp {
	static void medicalCheckup(Doctor doctor) {
		System.out.println("Doing medical checkup");
	}
}
//functions in java is by default virtual (for overriding)
class Doctor {
	void diagnose() {
		System.out.println("Doctor diagnose");
	}
}
class Surgeon extends Doctor {
	
	void diagnose() {
		System.out.println("Surgeon diagnose");
	}
	void doSurgery() {
		System.out.println("Surgeon do surgery");
	}
}
class HeartSurgeon extends Surgeon {
	void diagnose() {
		System.out.println("HeartSurgeon diagnose");
	}
	void checkECG() {
		System.out.println("ECG check done");
	}
}
