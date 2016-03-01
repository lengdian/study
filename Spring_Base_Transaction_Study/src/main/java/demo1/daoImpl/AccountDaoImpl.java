package demo1.daoImpl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import demo1.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao
{
	@Override
	public void intMoney(int inAccountID, double money)
	{
		String sql = "update account set money=money+? where accountID=?";

		this.getJdbcTemplate().update(sql, money, inAccountID);

	}

	@Override
	public void outMoney(int outAccountID, double money)
	{
		String sql = "update account set money=money-? where accountID=?";

		this.getJdbcTemplate().update(sql, money, outAccountID);
	}

}
