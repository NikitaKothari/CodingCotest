package test.techgig;

class x {
	int a;
}

public class MultiThreading extends x {
	void Test() {
		a = 5;
	}

	public static void main(String agrs[]) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.println("x");
		t.wait(10000);
		System.out.println();
	}

	public void a(long x) {
		x++;
	}

	public void run() {
		System.out.println("r1");
		System.out.println("r2");
	}
}
