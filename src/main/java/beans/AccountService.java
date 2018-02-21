package beans;

public interface AccountService {

	public void transferMoney(long sourceAccountId, long targetAccountId, double amount);
	public void depositMoney(long accountId, double ammount) throws Exception;
	public Account getAccount(long accountId);
}
