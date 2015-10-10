package staticProxy;

public class LogProxy implements Movable
{
	Movable car;

	public LogProxy(Movable car)
	{
		this.car = car;
	}

	@Override
	public void move()
	{
		System.out.println("开始记录...");

		car.move();

		System.out.println("记录结束...");
	}
}
