import java.util.Scanner;

public class TuitionProgram {

	public static void main(String[] args) {

		java.util.Scanner input = new Scanner(System.in);

		// Initial Tuition
		System.out.print("Initial Tuition Cost: ");
		double InitialTuition = input.nextDouble();

		// Percentage Increase
		System.out.print("Percentage Increase: ");
		double Percent = input.nextDouble();

		input.close();

		double calculation = 0;
		
		for(int i = 1; i < 4; i++) {
			InitialTuition += (InitialTuition * (Percent/100));
			calculation += InitialTuition;
		}

		// Result
		System.out
				.printf("The total amount of tuition cost spent in the next four years is: $"
						+ "%.2f", calculation);
	}
}