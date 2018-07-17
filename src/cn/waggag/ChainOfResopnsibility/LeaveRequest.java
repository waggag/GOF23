package cn.waggag.ChainOfResopnsibility;

/**
 * 封装请假的基本信息
 * @author waggag
 * 2018年7月17日 下午6:11:48
 */
public class LeaveRequest {
	
	private String empName;
	private int leaveDays;
	private String reason;
	
	public LeaveRequest(String empName, int leaveDays, String reason) {
		super();
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
