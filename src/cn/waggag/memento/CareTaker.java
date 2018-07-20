package cn.waggag.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author waggag
 * 2018年7月20日 下午3:30:06
 */
public class CareTaker {
	
	private EmpMemento memento;

//	private List<EmpMemento> list = new ArrayList<EmpMemento>();
	
	
	
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
	
	
	
}
