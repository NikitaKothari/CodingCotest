package test.techgig;

class B {
	public void test() {
		System.out.println("inside b");
	}

	public void test1() {
		System.out.println("inside b1");
	}
}

public class Test extends B {
	public void test() {
		System.out.println("inside A");
	}

	public static void main(String[] args) {
		B b = new Test();
		b.test();
		b.test1();
	}

}
