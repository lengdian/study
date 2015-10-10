package staticProxy;

public class TimeProxy implements Movable
{
	Movable car;

	public TimeProxy(Movable car)
	{
		this.car = car;
	}

	@Override
	public void move()
	{
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");

		car.move();

		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶... 汽车行驶时间：" + (endTime - startTime) + "毫秒");

	}
}
