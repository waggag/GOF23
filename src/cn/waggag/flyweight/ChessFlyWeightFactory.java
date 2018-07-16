package cn.waggag.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author waggag
 * 2018年7月16日 下午8:45:05
 */
public class ChessFlyWeightFactory {
	//享元池
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color){
		
		if(map.get(color) == null){
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}else{
			return map.get(color);
		}
		
	}
}
