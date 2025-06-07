package AbstractFactory;

public class Box implements Icon { //Product A2
	public void draw() {
		System.out.print("[ ] ");
	}
	
	public void fill() {
		System.out.println("[X] ");
	}
}
