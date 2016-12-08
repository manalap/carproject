package fi.agileo.carproject.domain;

public class MyEnum {

	public enum AjoTapa {
		agressiivinen(1.0),
		tavallinen(0.7),
		rauhallinen(0.4);
	
	private final double value;
	
	AjoTapa(double value){
		this.value=value;
	}
	
	double getValue(AjoTapa ajo){
		return ajo.value;
	}
	
	
  }

}