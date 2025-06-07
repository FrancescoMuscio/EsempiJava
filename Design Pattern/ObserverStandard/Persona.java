package ObserverStandard;

public class Persona {
	
	String nome; 
	String cognome; 
	String telefono; 
	String citta;
	
	public Persona(String nome, String cognome, String telefono, String citta) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.citta = citta;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public String getCitta(){
		return citta;
	}
}
