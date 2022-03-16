package day_2;
import java.util.*;
public class program_5 {
	    int result(int[]arr) {
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			avg+=arr[i];
		}
		return avg/arr.length;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int average=result(arr);
		System.out.print(average);
	}
}
