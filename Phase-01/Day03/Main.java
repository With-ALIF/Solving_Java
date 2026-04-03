class Device {
    int id;
    String brand;
    String model;
    double price;
    int releaseYear;

    Device(int id, String brand, String model, double price, int releaseYear) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    void display() {
        System.out.println(
            "ID: " + id +
            ", Brand: " + brand +
            ", Model: " + model +
            ", Price: $" + price +
            ", Release Year: " + releaseYear
        );
    }
}

public class Main {
    public static void main(String[] args) {

        Device[] devices = new Device[5];

        devices[0] = new Device(1, "Apple", "iPhone 15", 999, 2023);
        devices[1] = new Device(2, "Samsung", "Galaxy S23", 899, 2023);
        devices[2] = new Device(3, "Dell", "XPS 13", 1299, 2022);
        devices[3] = new Device(4, "Apple", "iPad Pro", 1099, 2021);
        devices[4] = new Device(5, "Lenovo", "ThinkPad X1", 1399, 2024);

        System.out.println("All Devices:");
        for (int i = 0; i < devices.length; i++) {
            devices[i].display();
        }

        Device newest = devices[0];
        Device mostExpensive = devices[0];

        for (int i = 1; i < devices.length; i++) {
            if (devices[i].releaseYear > newest.releaseYear) {
                newest = devices[i];
            }
            if (devices[i].price > mostExpensive.price) {
                mostExpensive = devices[i];
            }
        }

        System.out.println("\nNewest Device:");
        newest.display();

        System.out.println("\nMost Expensive Device:");
        mostExpensive.display();
    }
}