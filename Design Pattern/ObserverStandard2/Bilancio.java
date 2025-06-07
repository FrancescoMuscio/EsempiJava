package ObserverStandard2;

public class Bilancio extends Subject{ //Concrete Subject
	private double bilancio = 0;
	
	public void deposita(double deposito) {
		System.out.println("Deposito di euro " + deposito);
		bilancio += deposito;
		setChanged();
		notify(bilancio);
	}
	
	public void ritiro(double ritiro) {
		if(ritiro <= bilancio) {
			System.out.println("Ritiro di euro " + ritiro);
			bilancio -= ritiro;
			setChanged();
			notify(bilancio);
		}else System.out.println("Soldi insufficienti");
	}
	
	
}
