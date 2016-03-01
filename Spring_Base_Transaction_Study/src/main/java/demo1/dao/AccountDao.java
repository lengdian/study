package demo1.dao;

public interface AccountDao
{
	/**
	 * @param intAccountID
	 *            :转入帐号ID
	 * @param money
	 *            :转入金额
	 */
	public void intMoney(int intAccountID, double money);

	/**
	 * @param outAccountID
	 *            :转出帐号
	 * @param money
	 *            :转出金额
	 */
	public void outMoney(int outAccountID, double money);
}
