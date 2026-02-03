public class Car {
    String id;
    String brand;
    String model;
    int year;
    int engineCapacity;

    Car(String id, String brand, String model, int year, int engineCapacity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("1", "Toyota", "Camry", 2020, 2500);
        Car car2 = new Car("2", "Honda", "Civic", 2019, 2000);

        System.out.println("Car 1: Car Brand - " + car1.brand + ", Car Model - " + car1.model +
                ", Year: " + car1.year +
                ", Engine Capacity: " + car1.engineCapacity + "cc");

        System.out.println("Car 2: Car Brand - " + car2.brand + ", Car Model - " + car2.model +
                ", Year: " + car2.year +
                ", Engine Capacity: " + car2.engineCapacity + "cc");
    }
}
