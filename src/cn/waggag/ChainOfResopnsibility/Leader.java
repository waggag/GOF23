package cn.waggag.ChainOfResopnsibility;

/**
 * 抽象类
 * @author waggag
 * 2018年7月17日 下午6:12:57
 */
public abstract class Leader {
	
	protected String name;
	protected Leader nextLeader; //责任链上的后继对象
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	//设定责任链上的后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	//处理请求的核心的业务方法
	public abstract void handleRequest(LeaveRequest request);
	
}
