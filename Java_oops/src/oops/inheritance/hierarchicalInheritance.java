package oops.inheritance;

class Parents {
    void parentMethod() {
        System.out.println("This is Parent class");
    }
}

class Child3 extends Parents {
    void child3Method() {
        System.out.println("This is Child1 class");
    }
}

class Child4 extends Parents {
    void child4Method() {
        System.out.println("This is Child2 class");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Child3 c3 = new Child3();
        c3.parentMethod();
        c3.child3Method();

        Child4 c4 = new Child4();
        c4.parentMethod();
        c4.child4Method();
    }
}
