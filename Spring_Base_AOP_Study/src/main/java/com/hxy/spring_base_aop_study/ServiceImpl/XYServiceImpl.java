package com.hxy.spring_base_aop_study.ServiceImpl;

import com.hxy.spring_base_aop_study.Service.XYService;

public class XYServiceImpl implements XYService
{
	@Override
	public void hxy()
	{
		System.out.println("hxy执行。");
	}

	@Override
	public void go(String str, int i)
	{
		System.out.println(str + i);

	}

	@Override
	public String todo()
	{
		System.out.println("todo执行");

		return "return success";

	}

}
