package week2;

public class EvenNumber {

	public static void main(String[] args) {
		//AP to print all the even numbers in an array
        int[] numbers = {14, 20, 19, 30, 21, 58, 29, 19, 29, 10};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
	}
}