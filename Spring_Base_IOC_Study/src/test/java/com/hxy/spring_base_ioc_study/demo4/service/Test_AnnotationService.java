package com.hxy.spring_base_ioc_study.demo4.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import util.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test_AnnotationService extends UnitTestBase
{
	public Test_AnnotationService()
	{
		super("classpath:spring-annotation.xml");
	}

	@Test
	public void test_annotation()
	{
		AnnotationService annotationService = super
				.getBean("annotationServiceImpl");
		annotationService.annotation();
	}
}
