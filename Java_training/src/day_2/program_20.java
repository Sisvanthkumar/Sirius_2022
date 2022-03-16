package day_2;

import java.util.Scanner;

public class program_20 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][]mat=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				mat[i][j]=sc.nextInt();
		for(int i=0;i<n;i++) {
			int max=-1;
			for(int j=0;j<m;j++) {
				if(max<mat[i][j])max=mat[i][j];
			}
			System.out.println("Maximum number in "+(i+1)+" is "+max);
		}
	}
}
