package Bridge;

public class TelecomandoSemplice extends Telecomando { //RefinedAbstraction
	
	public TelecomandoSemplice(Device device) {
        super(device);
    }
    
    public void mute() {
        System.out.println("Mute attivato");
        device.setVolume(0);
    }
}
