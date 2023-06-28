import java.util.Scanner;

public class Usnamepwd {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print(" Enter user name => ");
			String userName = scanner.nextLine();

			System.out.print(" Enter password => ");
			String password = scanner.nextLine();

			if ("kpmg".equals(userName) && "kpmg123".equals(password)) {
				System.out.println(" User successfully logged-in.. ");
			} else {
				System.out.println(" In valid userName of password ");
			}
		}
	}
}
