import java.util.Scanner;

public class Weekdispaly {

	public static void main(String[] args) {

		Scanner wd = new Scanner(System.in);

		System.out.println("Input number:");
		int day = wd.nextInt();
		System.out.println(getDayName(day));

	}

	private static String getDayName(int day) {

		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day range";
		}

		return dayName;
	}
}