package Bridge;

public class TelecomandoAvanzato extends Telecomando { //RefinedAbstraction
	
	public TelecomandoAvanzato(Device device) {
        super(device);
    }

    public void setChannel(int channel) {
        System.out.println("Canale impostato su " + channel);
    }
}
