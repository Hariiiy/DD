import java.util.Scanner;

public class BMIcalculator {

	// SL:create nesaccery variables for later use
	public float weight = 0f;
	public float height = 0f;
	public Scanner sc = new Scanner(System.in);

	
	
	
	public static void main(String args[]) {

		// SL:following only for testing purposes right now, feel free to comment out
		BMIcalculator cBmIcalculator = new BMIcalculator();
		cBmIcalculator.AskforHeight();
		cBmIcalculator.AskforWeight();
		System.out.println(cBmIcalculator.weight + " " + cBmIcalculator.height);
		
		// JH: displayer BMI and interpret of BMI
		float bmi = cBmIcalculator.calculateBMI(cBmIcalculator.weight, cBmIcalculator.height);
	    System.out.println("Your BMI is: " + bmi);
	    interpretBMI(bmi);
	}
	
	
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
	
	//HH: Calculate BMI
	public float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }
	
	//HH: Display a recommendation base on BMI
	public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Your weight in normal range.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight(pre-obese).");
        } else {
            System.out.println("You are obese.");
        }
    }
 
}


