package Oops.Polymorphism;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.m(50, 40);
		a.m(10, 80);

	}
}
class A{	
	public void m(int a,float b) {
		System.out.println(a/b);
	}
		public void m(int a ,int b) {
			System.out.println(a*b);	
	}
}