package wednesday;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int rev;
		
		System.out.println("Enter a number");
		rev = myObj.nextInt();
		
		System.out.println("Number is " + rev);
		
		if(rev > 0) {
			System.out.println(rev + " Is a positive number");
		
		} else if(rev == 0) {
			System.out.println(rev + " is zero");
		}
			else {
		}
			System.out.println(rev + " Is a negative number");
				
		}
	}
	


