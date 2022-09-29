package friday;

public class FibonacciInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


import java.util.Scanner;
public class main {

public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int fibibaccuiNum;
    System.out.println("Enter a number");
    fibonacciNum = myScanner.nextInt();
    int a = 0;
    int b=1;
    //int c=0;
    //System.out.println(a);
    //System.out.println(b);
    for(int i = 3; i<=fibonacciNum; i++) {
       int c = a+b;
        System.out.println(c);
        a=b;
        b=c;
    }



}

}