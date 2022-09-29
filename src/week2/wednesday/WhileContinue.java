package week2.wednesday;

public class WhileContinue {

	public static void main(String[] args) {
		// for while have to increase variable by one or will have infinite loop
		int i = 0;
		while (i < 10) {
				
			i++;
			
			if(i ==5) {
				continue;
			}
			System.out.println(i);
			
			}
		
		System.out.println("After the loop");
		//i++;

	}

}
