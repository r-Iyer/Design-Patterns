public final class ProxyBankAccount implements BankAccount{
    private final String bankAccountPassword;
    private RealBankAccount realBankAccount;
    
    public ProxyBankAccount(String bankAccountPassword, RealBankAccount realBankAccount) {
        this.bankAccountPassword = bankAccountPassword;
        this.realBankAccount = realBankAccount;
    }
    public boolean authenticate(String password) {
        return password.equals(this.bankAccountPassword);
    }

    public int checkBalance(String password) {

        if(authenticate(password))
            return realBankAccount.checkBalance();
        else   
            System.err.println("Wrong password!");
        return 0;
    }

    public void deposit(int amount, String password) {
        if(authenticate(password))
            realBankAccount.deposit(amount);
            else   
            System.err.println("Wrong password!");        
    }

    public void withdraw(int amount, String password) {
        if(authenticate(password))
            realBankAccount.withdraw(amount);
        else   
            System.err.println("Wrong password!");
    }

    public String getBankAccountPassword() {
        return bankAccountPassword;
    }
    @Override
    public void deposit(int amount) {
        throw new UnsupportedOperationException("Authenticate First!");
    }
    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException("Authenticate First!");
    }
    @Override
    public int checkBalance() {
        throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    }
    @Override
    public String getId() {
        return realBankAccount.getId();
    }

    public RealBankAccount getRealBankAccount() {
        return realBankAccount;
    }

    public void setRealBankAccount(RealBankAccount realBankAccount) {
        this.realBankAccount = realBankAccount;
    }

}
