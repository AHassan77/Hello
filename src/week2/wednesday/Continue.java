package week2.wednesday;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i ==6) {
			continue; // Skip the current iteration and jumps to the next iteration. this case skips 5
		}
			System.out.println(i);
	}
		System.out.println("After the loop");
	}
}