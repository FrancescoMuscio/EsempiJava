package Bridge;

public class MainBridge {

	public static void main(String[] args) {
		
		 	Device tv = new TV();
	        Device radio = new Radio();

	        Telecomando basicRemoteForTV = new TelecomandoSemplice(tv);
	        Telecomando advancedRemoteForRadio = new TelecomandoAvanzato(radio);

	        System.out.println("Usando il BasicRemote con la TV:");
	        basicRemoteForTV.turnOn();
	        basicRemoteForTV.setVolume(20);
	        ((TelecomandoSemplice) basicRemoteForTV).mute();
	        basicRemoteForTV.turnOff();

	        System.out.println("\nUsando l'AdvancedRemote con la Radio:");
	        advancedRemoteForRadio.turnOn();
	        advancedRemoteForRadio.setVolume(15);
	        ((TelecomandoAvanzato) advancedRemoteForRadio).setChannel(102);
	        advancedRemoteForRadio.turnOff();

	}
}
