package oops.inheritance;

interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("From A");
    }

    public void showB() {
        System.out.println("From B");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}

// Java does not support multiple inheritance(it's called Diamond Problem) with classes to avoid ambiguity. But we can do it using interfaces.

