package cn.waggag.flyweight;

/**
 * @author waggag
 * 2018年7月16日 下午8:46:56
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);
		
		System.out.println("增加外部状态的处理===========");
		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
		
		//两个是同一个类,只是在使用时对外部状态进行处理
		System.out.println(chess1);
		System.out.println(chess2);
		
		
	}
}
