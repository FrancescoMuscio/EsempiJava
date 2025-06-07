package FactoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        // Usa il metodo statico Creator.getPersona per ottenere un oggetto Persona
        Persona persona = Creator.getPersona();

        // Invoca il metodo parla sull'oggetto restituito
        persona.parla();

        // Esegui più istanze per vedere il comportamento casuale
        for (int i = 0; i < 5; i++) {
            Persona nuovaPersona = Creator.getPersona();
            nuovaPersona.parla();
        }
    }
}

