import java.util.Scanner;
public class fibex {

	public static void main(String[] args) {
				int num1 = 0;
				int num2 = 1;
				String count;
				//System.out.println(num1);
				//System.out.println(num2);
				Scanner myObj = new Scanner(System.in);
				count = myObj.nextLine();
				for(int i =0; i<10; i++){
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
				System.out.println(num3);
				}

		}

		}