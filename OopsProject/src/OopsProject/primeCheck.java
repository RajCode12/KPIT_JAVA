package OopsProject;

public class primeCheck {
	public static void main(String[] args) {
		int n = 23;
		boolean res = isPrime(n);
		if(res) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0 || n % 3 == 0) return false;
		for(int i = 5; i <= Math.sqrt(n); i += 6) {
			if(n % i == 0 || n % (i+2) == 0) {
				return false;
			}
		}
		return true;
	}
	// 23 - 1,23
	// 23 1----4 
	// 17 1234
	// 12 1,2,3 6
}
