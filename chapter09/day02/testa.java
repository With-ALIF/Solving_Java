class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
}

class A extends B {
    public A(int t) {
        System.out.println("A's constructor is invoked");
    }
}

public class testa {
    public static void main(String[] args) {
        A a = new A(3);
    }
}