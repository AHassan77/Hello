package FridayChallenges;

import java.util.Scanner;

public class Inches {

public static void main(String[] args) {
	
		Scanner inches = new Scanner(System.in);

        System.out.println("Input a value to be converted to meters: ");
		
		double input = inches.nextInt();
		
		System.out.println(input + " inches equals to " + input*0.0254 + " meters");
		
}

}


