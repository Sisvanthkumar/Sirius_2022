package day_2;
import java.util.*;
public class program_4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int flag=010;
		for(int i=2;i<=x/2;i++)
			if(x%i==0)flag=1;
		if(flag==1)System.out.println("Not a prime number");
		else System.out.println("It is a prime number");
	}
}
