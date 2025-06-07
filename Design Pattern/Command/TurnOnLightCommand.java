package Command;

public class TurnOnLightCommand implements Command { //ConcreteCommand 1

	private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
