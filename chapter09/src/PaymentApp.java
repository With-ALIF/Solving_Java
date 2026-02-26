abstract class PaymentMethod {

    protected double amount;
    protected String transactionId;

    public PaymentMethod(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void processPayment() {
        System.out.println("Log: Initializing " + transactionId +
                " for $" + amount + "...");
    }
}

class CreditCardPayment extends PaymentMethod {

    private String issuer;

    public CreditCardPayment(double amount, String transactionId, String issuer) {
        super(amount, transactionId);
        this.issuer = issuer;
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Security: Performing 128-bit encryption for "
                + issuer + " gateway...");
        System.out.println();
    }
}

class UPIPayment extends PaymentMethod {

    private String vpa;

    public UPIPayment(double amount, String transactionId, String vpa) {
        super(amount, transactionId);
        this.vpa = vpa;
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Security: Sending ping to " + vpa +
                ". Awaiting 4digit mobile PIN...");
        System.out.println();
    }
}

class CryptoPayment extends PaymentMethod {

    private String walletAddress;

    public CryptoPayment(double amount, String transactionId, String walletAddress) {
        super(amount, transactionId);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Security: Broadcasting to ledger. Wallet: "
                + walletAddress + ". Estimated wait: 2 mins...");
        System.out.println();
    }
}

public class PaymentApp {

    public static void main(String[] args) {

        PaymentMethod[] pendingTransactions = new PaymentMethod[3];

        pendingTransactions[0] =
                new CreditCardPayment(250.50, "TXN1001", "HSBC");

        pendingTransactions[1] =
                new UPIPayment(1200.00, "TXN1002", "alif@upi");

        pendingTransactions[2] =
                new CryptoPayment(0.005, "TXN1003", "0xABCD1234XYZ");

        for (PaymentMethod payment : pendingTransactions) {
            payment.processPayment();
        }
    }
}