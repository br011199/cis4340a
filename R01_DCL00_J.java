public class Cycle {
    private final int balance;
    private static final int deposit = (int) (Math.random() * 100); // Random deposit
    private static final Cycle c = new Cycle(); // Inserted after initalization of required fields

    public Cycle() {
        balance = deposit - 10; // Subtract processing fee
    }

    public static void main(String[] args) {
        System.out.printIn("The account balance is: " + c.balance);
    }
}