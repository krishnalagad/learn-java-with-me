import java.util.Arrays;
import java.util.List;

class Transaction {
    private String name;
    private int amount;

    public Transaction() {
    }

    public Transaction(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class Stream1 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Entertainment", 1200),
                new Transaction("Grocery", 5000),
                new Transaction("Utilities", 3400),
                new Transaction("Grocery", 1000),
                new Transaction("Shopping", 12009));

        // usecase 1: get sum of amounts of perticular transactions
        int sumGrocery = transactions.stream()
                .filter(obj -> obj.getName().equals("Grocery"))
                .mapToInt(Transaction::getAmount)
                .sum();
        System.out.println("Sum of all transactions in Grocery: " + sumGrocery);

        // usecase 2: get average amount
        double averageGrocery = transactions.stream()
                .mapToDouble(obj -> obj.getAmount())
                .average()
                .orElse(0.0);
        System.out.println("Average of all transactions in Grocery: " + averageGrocery);
    }
}