package dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler
{
	private Object instance;

	public LogHandler(Object instance)
	{
		this.instance = instance;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("日志记录开始");

		method.invoke(instance, args);

		System.out.println("日志记录结束");

		return null;
	}

}
