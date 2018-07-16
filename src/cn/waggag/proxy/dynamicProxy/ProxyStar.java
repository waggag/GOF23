package cn.waggag.proxy.dynamicProxy;

/**
 * 模拟动态生成的代理的结构
 * @author waggag
 * 2018年7月16日 下午7:30:41
 */
public class ProxyStar implements Star {
	
	StarHandler handler;
	
	public ProxyStar(StarHandler handler) {
		super();
		this.handler = handler;
	}

	public void bookTicket() {
//		handler.invoke(this,当前方法 , args);
	}

	public void collectMoney() {
//		handler.invoke(this,当前方法 , args);
	}

	public void confer() {
//		handler.invoke(this,当前方法 , args);
	}

	public void signContract() {
//		handler.invoke(this,当前方法 , args);
	}

	public void sing() {
//		handler.invoke(this,当前方法 , args);
	}

}
