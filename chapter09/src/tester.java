class Person {

    public void printPerson() {
        System.out.println(getInfo());
    }

    protected String getInfo() {
        return "Person";
    }
}

class Student extends Person {

    protected String getInfo() {
        return "Student";
    }
}

public class tester {

    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}