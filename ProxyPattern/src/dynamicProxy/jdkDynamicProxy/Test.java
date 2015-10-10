package dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import staticProxy.Car;
import staticProxy.Movable;

/**
 * JDK动态代理测试类
 * @author hxy
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		Car car=new Car();
		InvocationHandler timeHandler=new TimeHandler(car);
		Class<?> cls=car.getClass();
		
		/**
		 * loader:类加载器
		 * interfaces:实现接口
		 * h:InvocationHandler
		 */
		//!!!m是代理类
		Movable m=(Movable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), timeHandler);
		
		m.move();
	}
}
