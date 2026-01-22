// page 333 - problem (d)

public class showErrorD {
    public static void main(String[] args) {
        C c = new C(5.0);
        System.out.println(c.value);
    }
}

class C {
    double value;

    C(double v) {
        value = v;
    }
}