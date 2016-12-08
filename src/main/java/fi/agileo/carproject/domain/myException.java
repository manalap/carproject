package fi.agileo.carproject.domain;

@SuppressWarnings("serial")
public class myException extends Exception{
	
	private String message = null;
	
		public myException(String message){
			super(message);
			this.message = message;
		}
		public String toString(){
			return "Nopeus ei saa olla 300<nopus<0";
		}
		
		public String getMessage(){
			return message;
		}
	}



