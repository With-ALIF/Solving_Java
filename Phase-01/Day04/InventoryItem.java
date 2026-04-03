class Item {
    int itemCode;
    String name;
    int stock;
    int price;

    Item(int itemCode, String name, int stock, int price) {
        this.itemCode = itemCode;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    void increaseStock(int amount) {
        stock += amount;
    }

    void decreaseStock(int amount) {
        if (stock >= amount) {
            stock -= amount;
        } else {
            stock = 0;
        }
    }

    void display() {
        System.out.println(
            "Code: " + itemCode +
            ", Name: " + name +
            ", Stock: " + stock +
            ", Price: " + price
        );
    }
}

public class InventoryItem {
    public static void main(String[] args) {

        Item[] items = new Item[4];

        items[0] = new Item(101, "Mouse", 10, 500);
        items[1] = new Item(102, "Keyboard", 0, 1200);
        items[2] = new Item(103, "USB Cable", 25, 150);
        items[3] = new Item(104, "Headphone", 0, 2200);

        items[0].decreaseStock(3);
        items[2].increaseStock(5);

        System.out.println("All Inventory Items:");
        for (int i = 0; i < items.length; i++) {
            items[i].display();
        }

        System.out.println("\nOut of Stock Items:");
        for (int i = 0; i < items.length; i++) {
            if (items[i].stock == 0) {
                items[i].display();
            }
        }

        int totalValue = 0;
        for (int i = 0; i < items.length; i++) {
            totalValue += items[i].stock * items[i].price;
        }

        System.out.println("\nTotal Inventory Value: " + totalValue);
    }
}
