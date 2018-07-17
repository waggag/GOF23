package cn.waggag.ChainOfResopnsibility;

/**
 * 经理类处理请假
 * @author waggag
 * 2018年7月17日 下午6:18:25
 */
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<10){
			System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.out.println("经理："+this.name+",审批通过！");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(request);
			}
		}
	}

}
