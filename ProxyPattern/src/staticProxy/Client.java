package staticProxy;

/**
 * 测试类
 * 
 * @author hxy
 * 
 */
public class Client
{
	public static void main(String[] args)
	{
		// Car car = new Car();
		// car.move();

		// 继承方式
		// Movable m = new Car2();
		// m.move();

		// 聚合方式
		// Car car = new Car();
		// Movable m = new TimeProxy(car);
		// m.move();

		// 采用聚合方式实现代理功能叠加,相当于多重代理
		Car car = new Car();
		TimeProxy timeProxy = new TimeProxy(car);
		LogProxy logProxy = new LogProxy(timeProxy);
		logProxy.move();
	}
}
