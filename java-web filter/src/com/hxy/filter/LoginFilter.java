package com.hxy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter
{
	private FilterConfig config = null;

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String uri = req.getRequestURI();
		System.out.println(uri);

		String unFilterPage = config.getInitParameter("unFilterPage");
		if (unFilterPage != null)
		{
			String[] pages = unFilterPage.split(";");

			for (String page : pages)
			{
				if (!"".equals(page) && uri.contains(page))
				{
					chain.doFilter(request, response);
					return;
				}
			}
		}

		if (req.getSession().getAttribute("username") != null)
		{
			chain.doFilter(request, response);
		}
		else
		{
			resp.sendRedirect("login.jsp");
		}

	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		config = fConfig;
	}

	public void destroy()
	{
	}

}
