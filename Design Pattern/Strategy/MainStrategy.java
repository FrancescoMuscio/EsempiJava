package Strategy;

public class MainStrategy {

	public static void main(String[] args) {
		
		ShippingService shippingService = new ShippingService();

        double weight = 10.0; // Peso del pacco in kg

        // Strategia standard
        shippingService.setShippingStrategy(new StandardShipping());
        System.out.println("Costo spedizione standard: " + shippingService.calculateCost(weight));

        // Strategia espressa
        shippingService.setShippingStrategy(new ExpressShipping());
        System.out.println("Costo spedizione espressa: " + shippingService.calculateCost(weight));

        // Strategia internazionale
        shippingService.setShippingStrategy(new InternationalShipping());
        System.out.println("Costo spedizione internazionale: " + shippingService.calculateCost(weight));

	}

}
