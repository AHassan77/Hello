package week1;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234; // Decimal System
		int reverse = 0;
		int remainder = 0;
		
		while (num >0 ) {
			remainder = num % 10; // Grab the last digit of the number
			reverse = (reverse * 10) + remainder; // Append the last digt to the reverse number
			num = num / 10; // Remove the last digit of the number
					
		}
		System.out.println("The reverse number is: " + reverse);

	}

}
