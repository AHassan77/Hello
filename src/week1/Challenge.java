package week1;

public class Challenge {
	
	public static void main(String[]) args) {
		int count = numberofSteps(14);
		
		System.out.println(count);
	}

	public static numberofSteps(int num) {

		int counter = 0;
		
		while (num > 0) {
			counter ++;
			
			if (num%2==0) {
				num/=2;
			} else {
				num -=1;
			}
		}
		
		return counter;

	}

}
