package day_2;

import java.util.Scanner;

public class program_24 {
	int a,b,c;
	program_24(){
		this.a=1;
		this.b=1;
		this.c=2;
	}
	program_24(int x,int y,int z){
		this.a=x;
		this.b=y;
		this.c=z;
	}
	    int compute(int x) {
		int ans=(a*(x*x))+(b*x)+c;
		return ans;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		new program_24();
		program_24 obj=new program_24(2,3,4);
		System.out.println(obj.compute(x));
	}
}
