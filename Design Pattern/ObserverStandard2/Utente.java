package ObserverStandard2;

public class Utente implements Observer2{ //Concrete Observer
	public void update(Subject subject, Object o) {
		System.out.println("Bilancio attuale: " + o);
	}
}
