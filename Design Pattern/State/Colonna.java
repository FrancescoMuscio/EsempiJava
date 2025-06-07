package State;

import java.util.List;

public class Colonna implements Display { // ConcreteState
	private final int numCar = 38;
	private final int numRighe = 12;
	
	@Override
	public void scrivi(List<String> testo) {
		int riga = 0;
		int col = 0;
			for (String p : testo) {
				if (col + p.length() > numCar) {
					System.out.println();
					riga++;
					col = 0;
				}
				if (riga == numRighe) break;
				System.out.print(p + " ");
				col += p.length() + 1;
		}
	}	
}