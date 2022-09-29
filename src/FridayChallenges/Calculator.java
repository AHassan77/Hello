package FridayChallenges;

import java.util.Scanner;
public class Calculator {

public static void main(String[] args) {
Scanner calculator = new Scanner(System.in);
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for finding Square");
		System.out.println("Press 6 for finding Square root");
		System.out.println("Press 7 for finding Reciprocal");
		
		int operation = calculator.nextInt();
		System.out.println("Enter the first number");
		int num1 = calculator.nextInt();
		System.out.println("Enter the second number");
		int num2 = calculator.nextInt();
		
		
		if (operation == 1)
				System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + num1+num2);
		else if (operation == 2)
			System.out.println(num1-num2);
		else if (operation == 3)
			System.out.println("The product of the numbers " + (float)num1 + " and " + (float)num2 + " is = " + (float)num1*num2);
		else if (operation == 4)
			System.out.println(num1/num2);
		else if (operation == 5)
			System.out.println("The Square of the number " + num1 + " is = " + num1*num1 );	
		else if (operation == 6)
			System.out.println(Math.sqrt(num1));
		
		System.out.println("To continue calculation Press 1 else Press any button to exit");
	}

}
