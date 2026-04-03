public class A {
    public A() {
        System.out.println("A's no-arg constructor is invoked");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}

class B extends A {
}