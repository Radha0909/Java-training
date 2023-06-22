import java.util.Scanner;

public class greatest {
	
	public static void main(String[] args) {
		
		Scanner gr = new Scanner(System.in);
		
		System.out.println("Input the first number:");
		
		int num1= gr.nextInt();
		
		System.out.println("Input the second number:");
		
		int num2= gr.nextInt();
		
		System.out.println("Input the third number:");
		
		int num3 = gr.nextInt();
		
		if(num1>num2)
		if(num1>num3)
		System.out.println("The gretest number is: " +num1);
		
		if(num2>num1)
		if(num2>num3)
		System.out.println("The gretest number is: " +num2);

		if(num3>num1)
		if(num3>num2)
		System.out.println("The gretest number is: " +num3);
		
		}
	}


