package Bridge;

public class TV implements Device { //Concrete Implementors
	
	private int volume;
    
    @Override
    public void turnOn() {
        System.out.println("TV accesa");
    }

    @Override
    public void turnOff() {
        System.out.println("TV spenta");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume TV impostato a " + volume);
    }
}
