package State;

import java.util.Arrays;
import java.util.List;

public class Libro { //Context

	private String testo = "Darwin's _Origin of Species_ persuaded the world that the "
			+ "difference between different species of animals and plants is not the fixed "
			+ "immutable difference that it appears to be.";
	
	private List<String> lista = Arrays.asList(testo.split("[\\s+]+"));
	private Display mode = new Colonna();
	
	public void mostra() {
		mode.scrivi(lista);
	}
	
	public void modeColonna() {
		mode = new Colonna();
	}
	
	public void modeParola() {
		mode = new SingolaParola();
	}
}
