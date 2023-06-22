import java.util.Scanner;

public class Sumaverage {

	public static void main(String[] args)

	{
		int i, numbers = 0, sum = 0;
		double avg;
		{

			System.out.println("Enter any 5 numbers : ");

		}
		for (i = 0; i < 5; i++) {
			Scanner num = new Scanner(System.in);
			numbers = num.nextInt();

			sum += numbers;
		}
		avg = sum / 5;
		System.out.println("The sum of 5 no is : " + sum + "\nThe Average is : " + avg);

	}
}
