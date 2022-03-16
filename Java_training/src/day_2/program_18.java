package day_2;

import java.util.Scanner;

public class program_18 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int val=0,temp=num;
	while(temp>0) {
		val=(val*10)+(temp%10);
		temp/=10;
	}
	while(val>0) {
		switch(val%10) {
		case 1:
			System.out.print("One ");
			break;
		case 2:
			System.out.print("Two ");
			break;
		case 3:
			System.out.print("Three ");
			break;
		case 4:
			System.out.print("Four ");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight ");
			break;
		case 9:
			System.out.print("Nine ");
			break;
		default:
			System.out.print("Zero ");
			break;
		}
		val/=10;
	}
}
}
