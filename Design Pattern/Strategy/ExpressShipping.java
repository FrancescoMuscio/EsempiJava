package Strategy;

public class ExpressShipping implements ShippingStrategy { //Concrete Strategy
	
	@Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0; // Costo espresso: 2€ per kg
	}
}
