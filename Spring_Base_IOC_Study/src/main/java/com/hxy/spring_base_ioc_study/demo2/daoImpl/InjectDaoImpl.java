package com.hxy.spring_base_ioc_study.demo2.daoImpl;

import com.hxy.spring_base_ioc_study.demo2.dao.InjectDao;

public class InjectDaoImpl implements InjectDao
{
	// 模拟数据库保存操作
	@Override
	public void save()
	{
		System.out.println("保存数据！");
	}

}
