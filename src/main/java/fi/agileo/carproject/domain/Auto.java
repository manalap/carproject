package fi.agileo.carproject.domain;

public class Auto {
	private String Merkki;
	private String Malli;
	private int huippuNopeus;
	
	Moottori Moottori;
	Ajaja	 Ajaja;
	
	
	public Auto(){
		
	}
	
	public  Auto (String merkki, String malli, int hnopeus, Moottori moottori,
			Ajaja ajaja) {
		this.Merkki = merkki;
		this.Malli = malli;
		this.huippuNopeus = hnopeus;
		this.Moottori = moottori;
		this.Ajaja = ajaja;
		
	}
	
	


	public String toString() {
		return "Auto [Merkki=" + Merkki + ", Malli=" + Malli
				+ ", huippuNopeus=" + huippuNopeus + ", Moottori=" + Moottori
				+ ", Ajaja=" + Ajaja + "]";
	}

	public String getMerkki() {
		return Merkki;
	}
	
	//Tehtävä 4.C  *****************************************************************************
	public double laskeNopeus(){
		double paluuArvo; 
		int ehjaSylinterit;
		
		ehjaSylinterit = (this.Moottori.getSylinterienMaara() - this.Moottori.isSylinteritaRikki());
		
		paluuArvo = (ehjaSylinterit * this.huippuNopeus) / Moottori.getSylinterienMaara();
		
		return paluuArvo;
	}

	public void setMerkki(String merkki) {
		Merkki = merkki;
	}

	public String getMalli() {
		return Malli;
	}

	public void setMalli(String malli) {
		Malli = malli;
	}

	public int getHuippuNopeus() {
		return huippuNopeus;
	}

	public void setHuippuNopeus(int huippuNopeus) {
		this.huippuNopeus = huippuNopeus;
	}

	public Moottori getMoottori() {
		return Moottori;
	}

	public void setMoottori(Moottori moottori) {
		Moottori = moottori;
	}

	public Ajaja getAjaja() {
		return Ajaja;
	}

	public void setAjaja(Ajaja ajaja) {
		Ajaja = ajaja;
	}
	

}
