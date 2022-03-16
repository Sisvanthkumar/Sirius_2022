package day_2;
//we can access a staic member from nonstatic method but cannot access a non-static  from static...this can be over comed by creating an object
public class program_17 {
	public static final int i=7;
	void nonStatic() {
		//i=8;
		System.out.print(i);
	}
	public static void main(String[]args) {
		System.out.print("Main Method ");
		//program_17 object=new program_17();
		//object.nonStatic();
	}
}
