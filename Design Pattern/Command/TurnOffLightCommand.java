package Command;

public class TurnOffLightCommand implements Command { //ConcreteCommand 2

	private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
