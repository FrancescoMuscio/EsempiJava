package Decorator;

public class MainDecorator {
	private Messaggio m = new Riduttore(new Testo("Taro", "There are four of us here!"));
	
	public static void main(String[] args) {
		System.out.println("Istanziazione ... ");
		MainDecorator c = new MainDecorator();
		c.test();
		c.test2();
	}
	
	private void test() {
		System.out.println("Invocazione metodo getTesto ... ");
		System.out.println("\ntesto: " + m.getTesto()+"\n");
		System.out.println("Invocazione metodo getDestin ... ");
		System.out.println("\ndestin: " + m.getDestin()+"\n");
	}

	private void test2() {
		System.out.println("Istanziazione m2 ... ");
		Messaggio m2 = new Riduttore(new Indirizzi(new Testo("Saro", "Saro, are you going to go home now?")));
		
		System.out.println("Invocazione metodo getTesto ... ");
		System.out.println("\ntesto: " + m2.getTesto()+"\n");
		System.out.println("Invocazione metodo getDestin ... ");
		System.out.println("\ndestin: " + m2.getDestin()+"\n");
	}
}
