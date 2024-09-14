public class RealBankAccount implements BankAccount{
    int amount;
    String id;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public int checkBalance() {
        return amount;
    }

    @Override
    public void deposit(int amount) {
        this.amount+=amount;
        
    }

    @Override
    public void withdraw(int amount) {
        this.amount-=amount;
        
    }
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RealBankAccount(String id, int amount) {
        this.amount = amount;
        this.id = id;
    }
}
