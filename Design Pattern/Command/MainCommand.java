package Command;

public class MainCommand {

	public static void main(String[] args) {
		
		// Receiver
        Light livingRoomLight = new Light();

        // Comandi concreti
        Command turnOn = new TurnOnLightCommand(livingRoomLight);
        Command turnOff = new TurnOffLightCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Accendere la luce
        remote.setCommand(turnOn);
        remote.pressButton();

        // Spegnere la luce
        remote.setCommand(turnOff);
        remote.pressButton();
	}

}
