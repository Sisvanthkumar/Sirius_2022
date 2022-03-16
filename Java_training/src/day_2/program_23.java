package day_2;

import java.util.Scanner;

public class program_23 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		test obj=new test();
		obj.add(a, b);
	}
}
class test{
	protected void add(int a,int b) {
		System.out.print(a+b);
	}
}
