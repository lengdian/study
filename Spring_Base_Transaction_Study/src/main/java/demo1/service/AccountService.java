package demo1.service;

public interface AccountService
{
	/**
	 * @param out
	 *            :转出金额
	 * @param in
	 *            ：转入金额
	 * @param money
	 *            ：转账金额
	 */
	public void transfer(int outID, int inID, Double money);
}
