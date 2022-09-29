package friday;

 class Reduce {

	public int numberOfSteps (int num) {
		// TODO Auto-generated method stub
		int a = 0;
		while (num > 0) {
			a++;
			num = num %2 == 0 ? num /2  :  num -1;
		}
		return a;
		
	}

}
