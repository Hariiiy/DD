import java.util.Scanner;

public class BMIcalculator {

	// SL:create nesaccery variables for later use
	public float weight = 0f;
	public float height = 0f;
	public Scanner sc = new Scanner(System.in);

	// SL:take in the number, set the limitations
	// it will be a good idea to merge the 2, but they have different limitations
	public void AskforWeight() {
		System.out.println("What is your weight in kg?");
		weight = sc.nextFloat();

		while (weight > 300 || weight < 10) {
			System.out.println("Number is too large or small, please re-enter");
			weight = sc.nextFloat();
		}

	}

	// SL:take in the number, set the limitations
	public void AskforHeight() {
		System.out.println("What is your height in meters?");
		height = sc.nextFloat();

		while (height > 2.2 || height < 0.2) {
			System.out.println("Number is too large or small, please re-enter");
			height = sc.nextFloat();
		}

	}

}

class Program {
	public static void main(String args[]) {
		// System.out.print("Hello world");

		// SL:following only for testing purposes right now, feel free to comment out
		BMIcalculator cBmIcalculator = new BMIcalculator();
		cBmIcalculator.AskforHeight();
		cBmIcalculator.AskforWeight();
		System.out.println(cBmIcalculator.weight + " " + cBmIcalculator.height);
	}
}
