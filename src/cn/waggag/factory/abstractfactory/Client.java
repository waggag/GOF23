package cn.waggag.factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		CarFactory  factory = new LuxuryCarFactory();
		CarFactory  factory2 = new LowCarFactory();
		
		Engine e = factory.createEngine();
		Engine e2 = factory2.createEngine();
		
		e.run();
		e.start();
		
		e2.run();
		e2.start();
		
	}
}
