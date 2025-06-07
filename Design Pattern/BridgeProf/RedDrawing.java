package BridgeProf;

public class RedDrawing implements Drawing { //ConcreteImplementor 1
   
	@Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("Disegno una linea rossa da (x1, y1) a (x2, y2)");
    }
}
