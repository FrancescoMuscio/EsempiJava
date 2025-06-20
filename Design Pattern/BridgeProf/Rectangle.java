package BridgeProf;

public class Rectangle extends Shape { //Refined Abstraction
    int x1, y1, x2, y2;
    
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void draw() {
        drawLine(x1, y1, x1, y2); drawLine(x1, y1, x2, y1);
        drawLine(x1, y2, x2, y2); drawLine(x2, y1, x2, y2);
    }
}
