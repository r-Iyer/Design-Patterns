import java.util.HashMap;
import java.util.Map;

public class BankAccountRepository {
    Map<String, RealBankAccount> realBankAccounts = new HashMap<>();
    protected RealBankAccount findById(String id) {
        return realBankAccounts.get(id);
    }
    protected void saveAccount(RealBankAccount account) {
        realBankAccounts.put(account.getId(), account);
    }
}
