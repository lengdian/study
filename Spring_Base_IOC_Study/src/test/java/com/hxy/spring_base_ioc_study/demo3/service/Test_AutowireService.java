package com.hxy.spring_base_ioc_study.demo3.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import util.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test_AutowireService extends UnitTestBase
{
	public Test_AutowireService()
	{
		super("classpath:spring-autowire.xml");
	}

	@Test
	public void test_auto()
	{
		AutowireService autowireService = super.getBean("autowireService");
		autowireService.auto();
	}
}
