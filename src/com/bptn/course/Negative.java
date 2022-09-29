package com.bptn.course;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		int num1 = 100;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number");
		
		//Numerical input
		int sal = myObj.nextInt();
		System.out.println("salary is: " + sal);
		if(sal>0) {
		System.out.println("Salary is positive");
	} else {
		System.out.println("Negative");
	}

  }
}
