package BridgeProf;

public abstract class Shape { //Abstraction
    protected Drawing impl;
    
    public void setImplementor(Drawing imp){ 
    	this.impl = imp; 
    }
    
    public void drawLine(int x, int y, int z, int t){
    	impl.drawLine(x, y, z, t);
    }
   
    public abstract void draw();
}
