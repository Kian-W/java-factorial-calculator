public class Main {
	public static void main(String[] args) {

		// Number to create factorial of
		double number = Double.valueOf(args[0]);

		// Print factorial
		System.out.println(Calculate(number));
	}

	// Function to calculate factorial
	public static double Calculate(double num) {
		double factorial = 1;

		// Times the factorial by i for each loop
		for(int i = 1; i <= num; i++) {
			factorial *= i;
		}

		return factorial;
	}
}
