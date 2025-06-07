package Template;

public class MainTemplate {

	public static void main(String[] args) {
		
		System.out.println("Making tea...");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

	}

}
