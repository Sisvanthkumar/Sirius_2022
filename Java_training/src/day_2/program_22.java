package day_2;

public class program_22 {
	public static void main(String[]args) {
		result res=new result();
	//	res.test_1();
		res.test_2();
		res.test_3();
		res.test_4();
	}
	
}
class result{
	private void test_1() {
		System.out.print("test_1");
	}
	public void test_2() {
		System.out.print("test_2 ");
	}
	protected void test_3() {
		System.out.print("test_3 ");
	}
	void test_4() {
		System.out.print("test_4 ");
	}
}
