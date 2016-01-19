package com.hxy.spring_base_ioc_study.demo3.daoImpl;

import com.hxy.spring_base_ioc_study.demo3.dao.AutowireDao;

public class AutowireDaoImpl implements AutowireDao
{
	@Override
	public void auto()
	{
		System.out.println("自动装配测试！");
	}

}
