public class BankAccountService {

    BankAccountRepository bankAccountRepository;
    public void saveAccount(RealBankAccount bankAccount) {
        bankAccountRepository.saveAccount(bankAccount);
    }
    public BankAccount findById(String id) {
        return bankAccountRepository.findById(id);
    }
    public ProxyBankAccount getProxyBankAccount(String id, String password) {
        RealBankAccount realBankAccount = bankAccountRepository.findById(id);
        return new ProxyBankAccount(password, realBankAccount);
    }
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
}
