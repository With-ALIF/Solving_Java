// page 333 - problem (c)

public class showErrors {
    class Circle {
        private double radius;

        public Circle(double r) {
            radius = r;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public void method1() {
        Circle c = new Circle(5);
        System.out.println("Area: " + c.getArea());
    }

    public static void main(String[] args) {
        showErrors obj = new showErrors();
        obj.method1();
    }
}