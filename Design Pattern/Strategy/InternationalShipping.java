package Strategy;

public class InternationalShipping implements ShippingStrategy { //Concrete Strategy
    
	@Override
    public double calculateShippingCost(double weight) {
        return weight * 3.5; // Costo internazionale: 3.5€ per kg
    }
}
