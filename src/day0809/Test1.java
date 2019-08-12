package day0809;

public class Test1 {
	static {
		System.out.println("1");
	}
	{//∆’Õ®
		System.out.println("2");
	}
	public Test1() {//ππ‘Ï
		System.out.println("3");
	}
	public static void main(String[] args) {
		new b();
	}

}
class b extends Test1{
	static{System.out.println("4");}
	public b() {
		System.out.println("5");
	}
	{
		System.out.println("6");
	}
}

