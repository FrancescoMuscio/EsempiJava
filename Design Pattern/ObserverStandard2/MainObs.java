package ObserverStandard2;

public class MainObs {

	public static void main(String[] args) {
		Utente observer = new Utente();
		Bilancio subject = new Bilancio();
		
		subject.attach(observer);
		subject.deposita(1000d);
		subject.ritiro(700d);
		subject.remove(observer);
		subject.deposita(800);
		subject.attach(observer);
		subject.deposita(200);

	}

}
