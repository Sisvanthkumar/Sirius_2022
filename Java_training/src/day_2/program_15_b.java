package day_2;

import java.util.Scanner;

public class program_15_b {
	static boolean armstrong_number(int num) {
		int sum1=0,temp=num;
		while(temp>0) {
			sum1+=((temp%10)*(temp%10)*(temp%10));
			temp/=10;
		}
		return (sum1==num);
	}
	static boolean perfect_number(int num) {
		int sum2=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)sum2+=i;
		}
		return (sum2==num);
	}
	static boolean palindrome(int num) {
		int sum3=0,temp1=num;
		while(temp1>0) {
			sum3=(sum3*10)+(temp1%10);
			temp1/=10;
		}
		return (sum3==num);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(armstrong_number(num))System.out.println(num+" is an armstrong number");
		if(perfect_number(num))System.out.println(num+" is a perfect number");
	 	if(palindrome(num))System.out.println(num+" is a palindrome");
	}
}
