package week2;

public class ReverseArray {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 7;
		numbers[4] = 4;
		
		for(int i = numbers.length -1; i >=0; i--) {
			System.out.println(numbers[i]);
		}
		

	}

}
