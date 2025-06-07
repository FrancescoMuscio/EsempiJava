package Template;

public class Coffee extends Beverage {

	@Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
