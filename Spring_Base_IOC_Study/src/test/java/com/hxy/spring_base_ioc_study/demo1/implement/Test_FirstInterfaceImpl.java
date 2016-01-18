package com.hxy.spring_base_ioc_study.demo1.implement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import util.UnitTestBase;

import com.hxy.spring_base_ioc_study.demo1.interfaces.FirstInterface;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test_FirstInterfaceImpl extends UnitTestBase
{
	public Test_FirstInterfaceImpl()
	{
		super("classpath:spring.xml");
	}

	// 简单测试
	@Test
	public void test1()
	{
		FirstInterface fi = super.getBean("firstInterface");

		fi.sayWord("hxy");

	}
}
