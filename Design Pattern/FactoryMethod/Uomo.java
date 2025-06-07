package FactoryMethod;

public class Uomo implements Persona{ //Concrete Product

	@Override
	public void parla() {
		System.out.println("Sono un uomo!");
	}
}
