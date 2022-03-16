package day_2;

import java.util.Scanner;

public class program_13 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sub=sc.nextInt();
		int[] arr=new int[n];
		int ind=0;
		for(int i=0;i<n;i++) {
			int result=0;
			for(int j=0;j<sub;j++) {
				int mark=sc.nextInt();
				result+=mark;
			}
			arr[ind++]=result;
		}
		for(int i=0;i<n;i++) {
			System.out.println("STUDENT "+(i+1)+" MARK IS: "+arr[i]);
		}
	}
}
