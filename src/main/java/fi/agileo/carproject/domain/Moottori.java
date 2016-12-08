package fi.agileo.carproject.domain;

public class Moottori {
	
	private int teho;
	private int sylinterienMaara;
	private int sylintereitaRikki;
	
	public Moottori(){
		
	}
	
	
	
	public Moottori(int teho, int sylMaara, int sylRikki){
		this.teho = teho;
		this.sylinterienMaara = sylMaara;
		this.sylintereitaRikki = sylRikki;
	}
	
	
	//Tehtävä 4.B   *****************************************************************************
	public int meneRikki(){
		int paluuArvo=0;
		
		this.sylintereitaRikki = 1 + (int)( Math.random() * 
				(this.sylinterienMaara 
				-
				sylintereitaRikki
				) );
		
		return paluuArvo;
	}
	

	
	public String toString() {
		return "Moottori [teho=" + teho + ", sylinterienMaara="
				+ sylinterienMaara + ", sylinteritaRikki=" + sylintereitaRikki
				+ "]";
	}



	public int getTeho() {
		return teho;
	}

	public void setTeho(int teho) {
		this.teho = teho;
	}

	public int getSylinterienMaara() {
		return sylinterienMaara;
	}

	public void setSylinterienMaara(int sylinterienMaara) {
		this.sylinterienMaara = sylinterienMaara;
	}

	public int isSylinteritaRikki() {
		return sylintereitaRikki;
	}

	public void setSylinteritaRikki(int sylintereitaRikki) {
		this.sylintereitaRikki = sylintereitaRikki;
	};
	
	

}
