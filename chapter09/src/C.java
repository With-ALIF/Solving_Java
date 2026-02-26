class A {
    public A(int x) {
        System.out.println("Value: " + x);
    }
}

class B extends A {
    public B() {
        super(10);
    }
}

public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}