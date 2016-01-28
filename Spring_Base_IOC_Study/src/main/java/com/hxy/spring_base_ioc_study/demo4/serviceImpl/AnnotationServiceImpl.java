package com.hxy.spring_base_ioc_study.demo4.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hxy.spring_base_ioc_study.demo4.dao.AnnotationDao;
import com.hxy.spring_base_ioc_study.demo4.service.AnnotationService;

//为bean指定ID
@Scope("singleton")
@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements AnnotationService
{
	@Autowired
	private AnnotationDao annotationDao;

	@Override
	public void annotation()
	{
		annotationDao.annotation();
		System.out.println("使用注解注册bean");
	}

}
