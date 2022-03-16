package day_2;

import java.util.Scanner;

public class program_21 {
	static boolean leap_year(int year) {
	    if((year%4==0)||(year%400==0 && year%100!=0)) {
	    	System.out.println("It is a leap year");
	    	return true;
	    }
	    return false;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String month=sc.next();
		int year=sc.nextInt();
		switch(month) {
		case "January":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		case "February":
			if(leap_year(year))System.out.print("Number of days in "+month+" is"+29);
			else System.out.print("Number of days in "+month+" is"+28);
			break;
		case"March":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		case "April":
			System.out.print("Number of days in "+month+" is "+30);
			break;
		case "May":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		case "June":
			System.out.print("Number of days in "+month+" is "+30);
			break;
		case "July":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		case "August":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		case "September":
			System.out.print("Number of days in "+month+" is "+30);
			break;
		case "October":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		case "November":
			System.out.print("Number of days in "+month+" is "+30);
			break;
		case "December":
			System.out.print("Number of days in "+month+" is "+31);
			break;
		default:
			System.out.print("Not a month...");
			break;
		}
	}
}
