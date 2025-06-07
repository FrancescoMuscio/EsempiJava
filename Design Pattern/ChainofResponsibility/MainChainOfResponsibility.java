package ChainofResponsibility;

public class MainChainOfResponsibility {

	public static void main(String[] args) {

		// Creazione degli handler
        Handler firstLevel = new FirstLevelSupport();
        Handler supervisor = new Supervisor();
        Handler manager = new Manager();

        // Configurazione della catena di responsabilità
        firstLevel.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        // Test di reclami con diversi livelli
        System.out.println("Gestione dei reclami:\n");

        firstLevel.handleComplaint("Problema semplice", 1);
        firstLevel.handleComplaint("Problema complesso", 2);
        firstLevel.handleComplaint("Problema critico", 3);
        firstLevel.handleComplaint("Problema sconosciuto", 4);

	}

}
