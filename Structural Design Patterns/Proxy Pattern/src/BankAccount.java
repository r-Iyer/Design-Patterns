public interface BankAccount {
    void deposit(int amount);
    void withdraw(int amount);
    int checkBalance();
    String getId();
}
