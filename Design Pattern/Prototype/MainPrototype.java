package Prototype;

public class MainPrototype {

	public static void main(String[] args) {
		
		// Creazione di un oggetto originale
        ConcretePrototype original = new ConcretePrototype("Original");
        System.out.println("Original: " + original);

        // Creazione di un clone
        ConcretePrototype clone =  (ConcretePrototype) original.clone();
        System.out.println("Clone: " + clone);

        // Modifica del clone
        clone.setName("Clone Modified");
        System.out.println("After modification:");
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
        System.out.println(original == clone);
	}
}
