package AbstractFactory;

public class MainAbstractFactory {

	public static void main(String[] args) {

		Creator c = new Creator1(); // istanzio un Creator
		Icon iProva = c.getIcon();
		Text tProva = c.getText();
		iProva.draw();
		iProva.fill();
		tProva.tell();
		
		Creator d = new Creator2();
		Icon iProva2 = d.getIcon();
		Text tProva2 = d.getText();
		iProva2.draw();
		iProva2.fill();
		tProva2.tell();

	}

}
