// page 334 - problem 9.12

public class Test {
    public static void main(String[] args) {
        A a = new A(10);
        a.print();
    }    
}

class A {
    int s;

    A(int newS) {
        s = newS;
    }

    public void print() {
        System.out.println("String: " + s);
    }
}