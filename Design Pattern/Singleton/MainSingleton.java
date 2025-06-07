package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        // Ottieni l'istanza del Singleton
        Singleton singletonInstance = Singleton.getIstance();

        // Chiama il metodo getColore e stampa il valore
        String colore = singletonInstance.getColore();
        System.out.println("Il colore del singleton è: " + colore);

        // Verifica che l'istanza sia unica
        Singleton anotherInstance = Singleton.getIstance();
        System.out.println("Le due istanze sono uguali? " + (singletonInstance == anotherInstance));
    }
}

