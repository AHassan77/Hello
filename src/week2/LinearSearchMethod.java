package week2;

public class LinearSearchMethod {

	public static void main(String[] args) {
		
		// Search #1
		int key = 15;
		int ind = 0;
		
		int[] a = { 3, 8, 4, 2, 12, 6};
		//          0  1  2  3   4  5
		
		ind = search(a,key);
		System.out.println("Index : " + ind);
		
		// Search #2
		
		key = 8;
		int [] b = { 5, 4, 1, 13, 8, 9 };
		
		ind = search(b,key);
		System.out.println("Index : " + ind);

	}
	
	// Two Parameters		 array,   key
	// Use method to reused code if you put
	
	public static int search(int[] a, int key) {
		
		int ind = -1;
		
		for (int i=0; i < a.length; i++ ) {
			
			if ( key == a[i] ) {
				ind = i;
				break;
			}
		}
		return ind;
	}

}
