package Bridge;

public class Radio implements Device{ //Concrete Implementors
	
	private int volume;

    @Override
    public void turnOn() {
        System.out.println("Radio accesa");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio spenta");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume Radio impostato a " + volume);
    }
}
