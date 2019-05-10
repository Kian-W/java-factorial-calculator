public class Main {
	public static void main(String[] args) {

		double number = 0;

		try {
			// Number to create factorial of
			number = Double.valueOf(args[0]);
		} catch(Exception e) {
			System.out.println("Usage: java Main [double]");
			System.exit(-1);
		}

			// Print factorial
			System.out.println(Calculate(number));
	}

	// Function to calculate factorial
	public static double Calculate(double num) {
		double factorial = 1;

		// Times the factorial by i for each loop
		for(int i = 1; i <= num; i++) 
			factorial *= i;
		
		return factorial;
	}
}
