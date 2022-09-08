package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("first number?");
		int n1=in.nextInt();
		System.out.print("second number?");
		int n2=in.nextInt();
		double avg=((double)n1+n2)/2;
		System.out.print("the average is "+avg);
		
	}

}
