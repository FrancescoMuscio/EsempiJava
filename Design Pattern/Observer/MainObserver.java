package Observer;

public class MainObserver {

	/*private Registro r = new Registro();
	private Monitor m = new Monitor();*/

	public static void main(String[] args) {
		/*MainObserver c = new MainObserver();
		c.test();*/
		Registro r = new Registro();
		Monitor m = new Monitor();
		r.addObserver(m);
		r.deposita(1200);
		r.ritira(500);
		
		System.out.println("Saldo attuale: " + r.getBilancio() + " euro");
		System.out.println("Il subject ha effettuato " + m.getNumOperazioni() + " operazioni");
	}
	
	/*private void test() {
		r.addObserver(m);
		r.deposita(1200);
		r.ritira(500);
		
		System.out.println("Saldo attuale: " + r.getBilancio() + " euro");
		System.out.println("Il subject ha effettuato " + m.getNumOperazioni() + " operazioni");
	}*/

}
