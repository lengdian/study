package com.hxy.spring_base_aop_study.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//使用AspectJ定义切面,需要配合component注解
@Component
@Aspect
public class AspectTwo
{
	// 定义切入点，切入点名称为方法名
	@Pointcut("execution(* com.hxy.spring_base_aop_study.ServiceImpl.*.todo(..))")
	public void go()
	{
	}

	// 前置通知-->最终通知与前置通知类似
	// @Before("execution(* com.hxy.spring_base_aop_study.ServiceImpl.*.todo(..))")
	@Before("go()")
	public void before()
	{
		System.out.println("before");
	}

	// 返回通知，可以设置得到调用方法的返回值
	@AfterReturning(pointcut = "go()", returning = "str")
	public void afterReturning(Object str)
	{
		System.out.println("afterReturning " + str);
	}

	// 抛出异常通知，可以设置获得抛出异常对象
	@AfterThrowing(pointcut = "go()", throwing = "e")
	public void afterThrowing(Exception e)
	{
		System.out.println("afterThrowing");
	}

	//环绕通知
	@Around("go()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("around before");

		Object obj = pjp.proceed();//可以在该方法中传递Object数组参数，作为调用方法的参数

		System.out.println("aroung after");

		return obj;
	}
}
