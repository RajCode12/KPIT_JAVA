package exception;

public class RocketExceptionTest {
	public static void main(String[] args) {
		Rocket rocket = null;
		try {
			rocket = new Rocket();
		} catch(IgnitionException e) {
			System.out.println("Problem1 : "+ e.getMessage());
		}
		while(true) {
			if(rocket != null) {
				try {
					rocket.launch();
				} catch(GravityException e) {
					System.out.println("Problem2 : " + e.getMessage());
				}
			} else {
				System.out.println("Rocket is not ready");
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(rocket.distanceCovered == 300000) {
				break;
			}
		}
	}
}
class IgnitionException extends Exception {

	public IgnitionException(String message) {
		super(message);
	}
	
}
class GravityException extends RuntimeException {

	public GravityException(String message) {
		super(message);
	}
}
class Rocket {
	int ignitionTemp = 15000;
	int gravity;
	int distanceCovered = 1;
	boolean ignitionStatus;
	boolean ignitionCheck() {
		if(ignitionTemp < 10000 && ignitionTemp > 20000) {
			return false;
		} else {
			return true;
		}
	}
	Rocket() throws IgnitionException {
		if(ignitionCheck() == false) {
			IgnitionException e = new IgnitionException("Temperature is not fine");
			throw e;
		}
	}
	void launch() {
		for(int i = distanceCovered; i <= 3000; i++) {
			distanceCovered++;
			if(i > 100 && i % 100 == 0) {
				double val = Math.random();
				if(val <= 0.5) {
					System.out.println("Distance covered :" + distanceCovered);
					GravityException e = new GravityException("Gravity is not fine");
					throw e;
				}
 			}
		}
	}
}

