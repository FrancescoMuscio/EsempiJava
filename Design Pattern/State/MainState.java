package State;

public class MainState {

	public static void main(String[] args) {

		Libro l = new Libro();
		
		l.mostra(); //di default è impostato il mode colonna, vedi classe Libro
		l.modeParola();
		l.mostra();
		
		l.modeColonna();
		l.mostra();

	}
}
