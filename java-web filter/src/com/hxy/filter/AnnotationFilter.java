package com.hxy.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 使用注解配置过滤器
 * 
 * @author hxy
 * 
 */
@WebFilter(value = { "/index.jsp" }, dispatcherTypes = { DispatcherType.REQUEST })
public class AnnotationFilter implements Filter
{

	@Override
	public void destroy()
	{

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException
	{

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{

	}

}
