package exception;

import java.util.Random;
import java.util.stream.IntStream;

public class UserDefinedException {

	public static void main(String[] args) //throws CoolantException 
	{
		System.out.println("Begin main");
		
		Car myCar = null;
		
			//Unhandled exception type CoolantException
			try {
				 myCar = new Car();
			}
			catch (CoolantException e) {
				System.out.println("Some problem1 : "+e.getMessage());
			}
			catch(PUCException e) {
				System.out.println("Some problem2 : "+e.getMessage());
			}
			
		while(true) {
			if(myCar != null) {
				try {
					myCar.longDrive();
				}
				catch(SpeedLimitExceededException e) {
					System.out.println("Speed Limit Exceeded 50");
				}
				catch(TrafficException e) {
					System.out.println("Waiting for the Green light");
					
				}
			} else {
				System.out.println("Car in not ready");
			}
			if(myCar.distance == 30) {
				break;
			}
		}
		//100
		System.out.println("End main");
	}
	
}

class SpeedLimitExceededException extends RuntimeException {

	public SpeedLimitExceededException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class TrafficException extends RuntimeException {

	public TrafficException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class PUCException extends Exception {

	public PUCException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}
class CoolantException extends Exception {

	public CoolantException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class Car
{
	boolean pucStatus; //false
	boolean coolantStatus; //false
	
	Car() throws CoolantException, PUCException
	{
		System.out.println("Checking the car...");
		checkPUC();
		
		if(pucStatus==true) {
			System.out.println("Checking all the docs..");

		}
		else {
			PUCException ex = new PUCException("PUC is expired...");
			throw ex;
		}
		
		System.out.println("Cheking the engine oil");
		System.out.println("checking the coolant...");
		checkCoolant();
		if(coolantStatus==true) {
			System.out.println("Coolant is sufficient");
		}
		else {
			//CoolantException ex = new CoolantException("Coolant need to be refilled");
			//throw ex;
			throw new CoolantException("Coolant need to be refilled");
			
		}
		System.out.println("all ok...");

	}

	private void checkPUC() {
		Random random = new Random();
		pucStatus = random.nextBoolean();
		
	}
	private void checkCoolant() {
		
		Random random = new Random();
		coolantStatus = random.nextBoolean();
//		for(int i=1;i<10;i++) {
//			double val = Math.random()%10; // 0 to 1
//			//System.out.println("val "+val);
//			if(val > 0.90) {
//				//System.out.println("Coolant is sufficient");
//				coolantStatus =true;
//				break;
//			}
//			else if(val<0.75) {
//				//System.out.println("Coolant need to be refilled");
//				coolantStatus = false;
//				break;
//			}
//		}
	}
	
	//throws mean the below method is susceptible to throw following type of checked excpetion
	int distance = 1;
	void longDrive() 
	{
			for (int i = distance; i <= 30; i++) {
			System.out.println("Km completed..."+i);
			distance++;
			//Random random = new Random();
			//int val = random.nextInt(120)+1;
			//System.out.println("val "+val);
			//System.out.println("val "+val);
			double val = Math.random() % 10;
			
			if(i % 5 == 0) {
				TrafficException et = new TrafficException("Red Sign : Stop");
				throw et;
			} 
			
			if(val > 0.50) {//unchecked exception
				SpeedLimitExceededException ex = new SpeedLimitExceededException("Speed limit exceeded");
				throw ex;
			}
			
			
		}
		System.out.println("JOURNEY OVER.....");
	}
}
