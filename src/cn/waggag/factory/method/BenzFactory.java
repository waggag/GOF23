package cn.waggag.factory.method;

public class BenzFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benz();
	}

}
