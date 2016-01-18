package com.hxy.spring_base_ioc_study.demo2.serviceImpl;

import com.hxy.spring_base_ioc_study.demo2.dao.InjectDao;
import com.hxy.spring_base_ioc_study.demo2.service.InjectService;

public class InjectServiceImpl implements InjectService
{
	private InjectDao injectDao;

	// spring ioc 设值注入
	public void setInjectDao(InjectDao injectDao)
	{
		this.injectDao = injectDao;
	}

	// spring ioc 构造注入
	public InjectServiceImpl()
	{
	}

	// spring ioc 构造注入
	public InjectServiceImpl(InjectDao injectDao)
	{
		this.injectDao = injectDao;
	}

	// 保存数据
	@Override
	public void save()
	{
		injectDao.save();
	}

}
