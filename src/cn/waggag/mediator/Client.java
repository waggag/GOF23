package cn.waggag.mediator;

/**
 * @author waggag
 * 2018年7月17日 下午6:49:03
 */
@SuppressWarnings("all")
public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		
		Market   market = new Market(m);
		Development devp = new Development(m);
		Finacial f = new Finacial(m);
		
		market.selfAction();
		market.outAction();
		
	}
}
