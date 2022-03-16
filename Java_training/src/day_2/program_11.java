package day_2;

import java.util.Scanner;

public class program_11 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		for(int i=1;;i++,System.out.println())
			if(num>n)break;
			else
			for(int j=1;j<=i;j++)
				System.out.print((num++)+" ");
	}
}
