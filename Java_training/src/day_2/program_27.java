package day_2;

public class program_27 {
	public static void main(String[]args) {
		int investment=14000;
		investment+=(investment*0.40);
		System.out.println("First year : "+investment);
		investment-=1500;
		System.out.println("Second year : "+investment);
		investment+=(investment*0.12);
		System.out.println("Third year : "+investment);
	}
}
