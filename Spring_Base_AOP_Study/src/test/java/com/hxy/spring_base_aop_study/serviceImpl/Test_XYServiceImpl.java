package com.hxy.spring_base_aop_study.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import util.UnitTestBase;

import com.hxy.spring_base_aop_study.Service.XYService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test_XYServiceImpl extends UnitTestBase
{
	public Test_XYServiceImpl()
	{
		super("classpath:spring-aop.xml");
	}

	@Test
	public void test_hxy()
	{
		// XYService xyService = super.getBean("xyServiceImpl");
		// xyService.hxy();
		// xyService.go("hxy", 8);

		// IntService intService = super.getBean("xyServiceImpl");
		// intService.in();

		XYService xyService = super.getBean("xyServiceImpl");
		xyService.todo();
	}
}
