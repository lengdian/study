package com.hxy.spring_base_ioc_study.demo2.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import util.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test_InjectService extends UnitTestBase
{
	public Test_InjectService()
	{
		super("classpath:spring2.xml");
	}

	@Test
	public void test_save()
	{
		InjectService injectService = super.getBean("injectService");
		injectService.save();
	}
}
