package SingletonMultiplo;

public class MainMultiSingleton {
	 public static void main(String[] args) {
	        MultiInstanceSingleton.setMaxInstances(3);
	        
	        MultiInstanceSingleton s1 = MultiInstanceSingleton.getInstance();
	        MultiInstanceSingleton s2 = MultiInstanceSingleton.getInstance();
	        MultiInstanceSingleton s3 = MultiInstanceSingleton.getInstance();
	        MultiInstanceSingleton s4 = MultiInstanceSingleton.getInstance(); // Dovrebbe restituire l'ultima istanza disponibile
	        
	        System.out.println("Numero di istanze create: " + MultiInstanceSingleton.getInstanceCount());
	        System.out.println(s3 == s4); // Controlla se l'istanza è riutilizzata
	        System.out.println(s1 == s4);
	    }
}
