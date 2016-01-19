package com.hxy.spring_base_ioc_study.demo3.serviceImpl;

import com.hxy.spring_base_ioc_study.demo3.dao.AutowireDao;
import com.hxy.spring_base_ioc_study.demo3.service.AutowireService;

public class AutowireServiceImpl implements AutowireService
{
	private AutowireDao autowireDao;

	public void setAutowireDao(AutowireDao autowireDao)
	{
		this.autowireDao = autowireDao;
	}

	@Override
	public void auto()
	{
		autowireDao.auto();
	}

}
