package test.testprogram;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.x = 10;
		System.out.println(a.x);
		A a1 = a;
		a1.x = 11;
		System.out.println(a.x);
		B b = new B();
		b.x = 1;
		a = b;
		B b1;
		b1 = (B) a;
		b1 = (B) a1;
	}

}
