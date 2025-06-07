package Strategy;

public class ShippingService { // Context
	
	private ShippingStrategy strategy;

    // Permette di settare dinamicamente la strategia
    public void setShippingStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    // Calcola il costo della spedizione usando la strategia corrente
    public double calculateCost(double weight) {
        if (strategy == null) {
            throw new IllegalStateException("Nessuna strategia di spedizione impostata.");
        }
        return strategy.calculateShippingCost(weight);
    }
}
