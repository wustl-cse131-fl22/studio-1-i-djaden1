package studio1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		boolean leapYearb;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year");
		int leapYear= in.nextInt();
		leapYearb = (leapYear % 4 == 0) && (leapYear % 100 != 0)||(leapYear % 400 == 0)
		;
		System.out.print("It is " + leapYearb + " that your year is a leap year");
	}


	
}
