package day_2;

import java.util.Scanner;

public class program_19 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 int[][] mat=new int[n][m];
		 for(int i=0;i<n;i++)
			 for(int j=0;j<m;j++)mat[i][j]=sc.nextInt();
		 for(int i=0;i<n;i++,System.out.println()) {
			 int start=0,end=m-1;
			 while(start<end) {
				 int temp=mat[i][start];
				 mat[i][start]=mat[i][end];
				 mat[i][end]=temp;
				 start++;
				 end--;
			 }
			 for(int j=0;j<m;j++)System.out.print(mat[i][j]+" ");
		 }
	}
}
