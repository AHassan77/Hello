package week2.wednesday;

public class Switch {
		public static void main(String[] args) {
			
			/*
			 * Day 0 ---> Sunday
			 * Day 1 ---> Monday
			 * Day 2 ---> Tuesday
			 * Day 3 ---> Wednesday
			 * Day 4 ---> Thursday
			 * Day 5 ---> Friday
			 * Day 6 ---> Saturday
			 */
			
			int day = 4;
			String str = "";
			/*
			if ( day==0 ) {
			  str = “Sunday”;	
			} else if ( day==1 ) {
				str = “Monday”;
			} else if ( day==2 ) {
				str = “Tuesday”;
			} else if ( day==3 ) {
				str = “Wednesday”;
			} else if ( day==4 ) {
				str = “Thursday”;
			} else if ( day==5 ) {
				str = “Friday”;
			} else if ( day==6 ) {
				str = “Saturday”;
			} else {
				str = “Invalid Day”;
			}
			
			System.out.println(str);
			*/
			//Using a switch statements
			
			day = 1;
			
			switch(day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day");
			}		
		}
	}

// Only use switch when it fully matches. You cannot uses ranges in switch like you can in a if statement
// for if statement you can do if 25>100 print this where you can't do this in switch