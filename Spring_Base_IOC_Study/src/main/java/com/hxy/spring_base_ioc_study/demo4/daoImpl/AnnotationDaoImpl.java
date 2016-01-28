package com.hxy.spring_base_ioc_study.demo4.daoImpl;

import org.springframework.stereotype.Repository;

import com.hxy.spring_base_ioc_study.demo4.dao.AnnotationDao;

@Repository("annotationDaoImpl")
public class AnnotationDaoImpl implements AnnotationDao
{
	@Override
	public void annotation()
	{
		System.out.println("数据库操作");
	}
	
}
