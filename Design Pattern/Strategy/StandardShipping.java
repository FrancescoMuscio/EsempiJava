package Strategy;

public class StandardShipping implements ShippingStrategy { //Concrete Strategy
    
	@Override
    public double calculateShippingCost(double weight) {
        return weight * 1.0; // Costo standard: 1€ per kg
    }
}
