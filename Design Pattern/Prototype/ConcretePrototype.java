package Prototype;

public class ConcretePrototype implements Prototype {
	
	 private String name;

	    public ConcretePrototype(String name) {
	        this.name = name;
	    }

	    // Getter e Setter
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Implementazione del metodo clone
	    @Override
	    public Prototype clone() {
	        return new ConcretePrototype(this.name);
	    }

	    @Override
	    public String toString() {
	        return "ConcretePrototype {name = '" + name + "'}";
	    }
}
