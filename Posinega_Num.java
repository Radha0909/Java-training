import java.util.Scanner;

public class Posinega_Num {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.println("Input number:");
		int input = num.nextInt();
		if (input > 0) {
			System.out.println("Number is Positive");
		} else if (input < 0) {

			System.out.println("Number is Negative");
		}

		else {

			System.out.println("Number is Zero");
		}
	}
}
