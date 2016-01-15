package com.hxy.spring_base_ioc_study.demo1.implement;

import org.junit.Test;

import util.UnitTestBase;

import com.hxy.spring_base_ioc_study.demo1.interfaces.FirstInterface;

public class Test_FirstInterfaceImpl extends UnitTestBase
{
	public Test_FirstInterfaceImpl()
	{
		super("classpath:spring.xml");
	}

	@Test
	public void test1()
	{
		FirstInterface fi = super.getBean("firstInterface");

		fi.sayWord("hxy");

	}
}
