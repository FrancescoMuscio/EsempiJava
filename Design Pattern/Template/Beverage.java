package Template;

abstract class Beverage { //classe astratta che definisce il Template
	
	// Metodo template: definisce l'algoritmo
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // Hook method
            addCondiments();
        }
    }

    // Passi comuni
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Passi da definire nelle sottoclassi
    protected abstract void brew();

    protected abstract void addCondiments();

    // Hook method: può essere sovrascritto
    protected boolean customerWantsCondiments() {
        return true;
    }
}
