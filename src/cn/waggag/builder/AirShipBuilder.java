package cn.waggag.builder;
/**
 * @author waggag
 * 2018年7月16日 下午5:43:42
 */
public interface AirShipBuilder {
	
	Engine builderEngine();

	OrbitalModule builderOrbitalModule();

	EscapeTower builderEscapeTower();
	
}
