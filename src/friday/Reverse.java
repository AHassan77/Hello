package friday;

public class Reverse {

	public static void main(String[] args) {
		int inputNumber = 123;
		int reverseNumber = 0;
		int remainder = 0;
		
		//%d is format specifier used for integer
		//%d is format specifier used for float
		//%c is format specifier used for character
		//Cannot use println have do use printf
		System.out.printf("the input number of %d", inputNumber);
		
		while(inputNumber>0) {
			remainder=inputNumber %10; //reminder
			inputNumber=inputNumber /10; //quotient
			
			reverseNumber=(reverseNumber *10) + remainder;
		}
		
		//if(inputNumber==reverseNumber) {
			//System.out.println("It is a palindrome");
		//}
		//else {
			//System.out.println("It is not a palindrome");
		
		System.out.printf("The reverse number is %d", reverseNumber);
				
	}
}


