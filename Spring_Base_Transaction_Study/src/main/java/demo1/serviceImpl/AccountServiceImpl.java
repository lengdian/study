package demo1.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo1.dao.AccountDao;
import demo1.service.AccountService;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService
{
	@Resource(name = "accountDaoImpl")
	private AccountDao accountDao;

	//采用注解方式的事务管理（该注解可使用在类或者方法上）,可在该注解上设置具体的事务管理规则
	@Transactional(readOnly=false)
	@Override
	public void transfer(int outID, int inID, Double money)
	{
		accountDao.outMoney(outID, money);
		int i = 1 / 0;
		accountDao.intMoney(inID, money);
	}

}
