package dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler
{
	private Object instance;

	public TimeHandler(Object instance)
	{
		this.instance = instance;
	}

	// 参数
	// proxy:被代理对象
	// method:被代理对象的方法
	// args:方法的参数
	//
	// 返回值：Object 方法的返回值
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("时间处理开始");

		method.invoke(instance, args);

		System.out.println("时间处理结束");

		return null;
	}

}
