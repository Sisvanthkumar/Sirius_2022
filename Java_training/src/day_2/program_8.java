package day_2;

import java.util.Arrays;
import java.util.Scanner;

public class program_8 {
	    static int binary_search(int[]arr,int start,int end,int target){
		int mid=(start+end)/2;
		if(arr[mid]>target)end=mid-1;
		else if(arr[mid]<target)start=mid+1;
		else return mid;
		if(start>end)return -1;
		return binary_search(arr,start,end,target);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int result=binary_search(arr,0,arr.length-1,target);
		if(result==-1)System.out.print("NOT FOUND");
		else System.out.print("Target found at position"+" "+(result+1));
	}
}
