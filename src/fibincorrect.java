import java.util.Scanner;
public class fibincorrect {

	public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
	    int fibNum;
	    System.out.println("Enter a number");
	    fibNum = myScanner.nextInt();
	    int a = 0;
	    int b=1;
	    //System.out.println(a);
	    //System.out.println(b);
	    for(int i = 1; i<=fibNum; i++) {
	        int c = a+b;
	        a=b;
	        b=c;
	        System.out.println(c);
	    }

	}

	}