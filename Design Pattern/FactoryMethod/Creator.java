package FactoryMethod;

public class Creator {
	public static Persona getPersona() {
		int rand = (int)(Math.random()*2);
		if(rand == 0) {
			return new Uomo();
		} else {
			return new Donna();
		}
	}
}
