package Singleton;

public class Singleton {
	private static Singleton oggetto = new Singleton();
	private String colore = "rosso";
	
	private Singleton(){
		//colore = "rosso";
	}
	
	public static Singleton getIstance() {
		return oggetto;
	}
	
	public String getColore() {
		return this.colore;
	}
}
