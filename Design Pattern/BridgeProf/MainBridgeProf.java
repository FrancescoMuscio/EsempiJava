package BridgeProf;

public class MainBridgeProf {

	public static void main(String[] args) {
		// Creazione di un rettangolo con coordinate specifiche
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        
        // Uso di RedDrawing
        Drawing redDrawing = new RedDrawing();
        rect.setImplementor(redDrawing);
        System.out.println("Disegno del rettangolo con RedDrawing:");
        rect.draw();
        
        // Uso di BlueDrawing
        Drawing blueDrawing = new BlueDrawing();
        rect.setImplementor(blueDrawing);
        System.out.println("\nDisegno del rettangolo con BlueDrawing:");
        rect.draw();

	}

}
