package AbstractFactory;

public class Circle implements Icon { //Product A1
	public void draw() {
		System.out.print("( ) ");
	}
	
	public void fill() {
		System.out.println("(o) ");
	}
}
