package rocket.station;

import rocket.station.exceptions.BoostException;
													//10:15
import rocket.station.exceptions.LaunchException;

public class RocketTest {
	public static void main(String[] args) throws LaunchException {
		RocketLauncher rl = null;
		try {
			rl = new RocketLauncher();// checkedException
			System.out.println("Rocket ctor fine...");
		} catch(BoostException e) { 
			System.out.println("Message1 : " + e); 
		}
		if(rl != null) {
			try {
				rl.launch();// Unchecked Exception
				System.out.println("Rocket lauch fine...");
			} catch(LaunchException e) {
				System.out.println("Message2 : " + e);
			}
		}
	}
}
class RocketLauncher {
	
	int dist = 1;
	RocketLauncher() throws BoostException { // for checked Exception 
		double val = Math.random(); // to generate random value in range 0 to 1
		if(val > 0.9) {
			BoostException e = new BoostException("Booster is not fine....");
			throw e;
		}
	}
	public void launch() throws LaunchException  {
		int dist = 1;
		for(int i = dist; i <= 20; i++) {
			double val = Math.random();
			dist++;
			if(val < 0.3) {
				// handling unchecked exception
				LaunchException e = new LaunchException("Distance Travelled : " + dist);
				throw e;
			}
		}
	}
}
