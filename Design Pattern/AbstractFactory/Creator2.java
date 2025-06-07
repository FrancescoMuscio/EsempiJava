package AbstractFactory;

public class Creator2 implements Creator { //ConcreteFactory 2
	public Icon getIcon() {
		return new Box();
	}
	
	public Text getText() {
		return new English();
	}
}
