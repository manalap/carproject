package fi.agileo.carproject.domain;


public class Ajaja {

	private Auto auto;
	private String nimi;
	private  Ajotapa ajo ;
	
	
	public Ajaja(){
	
	}
	
	public Ajotapa getAjoTapa() {
		return ajo;
	}



	public void setAjoTapa(Ajotapa ajoTapa) {
		this.ajo = ajoTapa;
	}
	
	
	public Ajaja(Auto myAuto, String myNimi, Ajotapa ajotapa){
		this.auto = myAuto;
		this.nimi = myNimi;
		this.ajo = ajotapa;
	}

	
	// Tehtävä 4.A ****************************************************************************
	/*
	public double aja(double tuntia) throws Exception{
		
		int nopeus = this.auto.getHuippuNopeus();
		if (nopeus<0 && nopeus>250) 
			throw new myException("nyt ei toimi");
		
		double paluuArvo;
		paluuArvo = nopeus * tuntia * this.ajo.getValue(ajo);
		
		
		return paluuArvo;
		
	}
	
	*/
	public String toString() {
		return "Ajaja [auto=" + auto + ", nimi=" + nimi + ", ajoTapa="
				+ ajo + "]";
	}



	public Auto getAuto() {
		return auto;
	}


	public void setAuto(Auto auto) {
		this.auto = auto;
	}


	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public enum Ajotapa {
		AGGRESSIIVINEN(1.0), TAVALLINEN(0.7),RAUHALLINEN(0.4);
		private final double kerroin;
		Ajotapa(double kerroin){
			this.kerroin = kerroin;
		}
	}
	
	public double aja(double tuntia){
		double paluuarvo;
		if (tuntia < 0.0) {
			return 0.0;
		}
		paluuarvo = auto.laskeNopeus() * tuntia * ajo.kerroin;
				return paluuarvo;
	}
	
}
