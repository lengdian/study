package com.hxy.spring_base_ioc_study.demo1.implement;

import com.hxy.spring_base_ioc_study.demo1.interfaces.FirstInterface;

public class FirstInterfaceImpl implements FirstInterface
{
	@Override
	public void sayWord(String word)
	{
		System.out.println("he says:" + word);
	}

}
