public class Main {
    public static void main(String[] args) throws Exception {

        String rohitPassword = "ro121097", rahulPassword = "ra280598";
        BankAccountRepository bankAccountRepository = new BankAccountRepository();
        BankAccountService bankAccountService = new BankAccountService(bankAccountRepository);
        
        RealBankAccount realBankAccount1 = new RealBankAccount("Rohit",40);
        RealBankAccount realBankAccount2 = new RealBankAccount("Rahul",100);

        bankAccountService.saveAccount(realBankAccount1);
        bankAccountService.saveAccount(realBankAccount2);

        ProxyBankAccount proxyBankAccount1 = bankAccountService.getProxyBankAccount("Rohit", rohitPassword);
        ProxyBankAccount proxyBankAccount2 = bankAccountService.getProxyBankAccount("Rahul", rahulPassword);

        proxyBankAccount1.deposit(5, rohitPassword);
        System.out.println(proxyBankAccount1.checkBalance(rohitPassword));

        proxyBankAccount2.deposit(10, rahulPassword);
        System.out.println(proxyBankAccount2.checkBalance(rahulPassword));

        proxyBankAccount2.deposit(10, rohitPassword); //Wrong password
        System.out.println(proxyBankAccount2.checkBalance(rahulPassword));
    }
}
