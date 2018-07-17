package cn.waggag.command;

/**
 * @author waggag
 * 2018年7月17日 下午7:17:27
 */
public class Client {
	public static void main(String[] args) {
		
		Command c = new ConcreteCommand(new Receiver());
		Invoke i = new Invoke(c);
		i.call();
	
		
//		new Receiver().action();
		
	}
}
