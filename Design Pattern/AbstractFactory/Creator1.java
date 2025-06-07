package AbstractFactory;

public class Creator1 implements Creator { //ConcreteFactory 1
	public Icon getIcon() {
		return new Circle();
	}
	
	public Text getText() {
		return new Japanese();
	}
}
