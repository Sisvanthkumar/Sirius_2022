package day_2;

import java.util.Scanner;

public class program_16 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int n=sc.nextInt(),count=0;
		int[] arr=new int[size];
		for(int i=0;i<size;i++)arr[i]=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(n==arr[i]) {
				count++;
				System.out.println(i+" index");
			}
		}
		if(count>0)System.out.print("THE TOTAL COUNT IS: "+count);
		else System.out.print("It is not present");
	}
}
