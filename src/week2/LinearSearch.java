package week2;

public class LinearSearch {

	public static void main(String[] args) {
		
		int key = 2;
		int ind = -1; // Tell the users that number they put not found
		
		int [] a = { 3,8,4,2,12,6 };
		//           0 1 2 3  4 5
		
		for(int i = 0; i<a.length; i++) {
			
			if ( key == a[i] ) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
				
			System.out.println("Index : " + ind);
	}
	
}


