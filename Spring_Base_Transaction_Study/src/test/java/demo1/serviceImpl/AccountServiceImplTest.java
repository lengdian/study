package demo1.serviceImpl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo1.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class AccountServiceImplTest
{
	@Resource(name = "accountServiceImpl")
	private AccountService accountService;

	@Test
	public void test_transfer()
	{
		accountService.transfer(1, 2, 200d);
	}

}
