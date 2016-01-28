package com.hxy.spring_base_aop_study.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectOne
{
	public void before()
	{
		System.out.println("前置通知：hxy之前执行");
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable
	{
		// 环绕：前
		System.out.println("环绕：前");

		Object object = pjp.proceed();

		// 环绕：后
		System.out.println("环绕：后");

		return object;
	}

	public Object aroundWithArgs(ProceedingJoinPoint pjp, String str, int i)
			throws Throwable
	{
		System.out.println("执行前：" + str + " " + i);
		str = "go";
		i = 7;

		Object obj = pjp.proceed();

		System.out.println("执行后：" + str + " " + i);

		return obj;

	}
}
