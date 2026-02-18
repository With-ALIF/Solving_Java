public class MicroInventory {

    private static int stock;

    public static void initializeStock(int initialStock) {
        if (initialStock < 0) {
            System.out.println("Initial stock cannot be negative. Setting stock to 0.");
            stock = 0;
        } else {
            stock = initialStock;
        }
    }

    public static int getStock() {
        return stock;
    }

    public static void decreaseStock(int qty) {
        if (qty <= 0) {
            System.out.println("Quantity to decrease must be positive.");
            return;
        }

        if (qty > stock) {
            System.out.println("Not enough stock to decrease by " + qty + ". Current stock: " + stock);
            return;
        }

        stock -= qty;
        System.out.println("Stock decreased by " + qty + ". Current stock: " + stock);
    }

    public static void main(String[] args) {
        initializeStock(15);
        System.out.println("Initial stock: " + getStock());

        decreaseStock(5);
        decreaseStock(20);
        decreaseStock(-3);
        decreaseStock(10);
    }
}
