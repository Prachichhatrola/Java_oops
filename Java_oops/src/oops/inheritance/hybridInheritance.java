package oops.inheritance;

//Interface A1
interface A1 {
	void methodA();
}

//Interface B1
interface B1 {
	void methodB();
}

//Class C1 implements A1 interface
class C1 implements A1 {
	public void methodA() {
		System.out.println("Implemented methodA from Interface A1");
	}
}

//Class D1 extends C1 and implements B1
class D1 extends C1 implements B1 {
	public void methodB() {
		System.out.println("Implemented methodB from Interface B1");
	}
}

//Main class
public class hybridInheritance {
	public static void main(String[] args) {
		D1 obj = new D1();
		obj.methodA(); // from A1 via C1
		obj.methodB(); // from B1
	}
}
