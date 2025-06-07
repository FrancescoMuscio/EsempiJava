package Mediator;

public class ConcreteUser extends User { //ConcreteColleague
	
	 public ConcreteUser(Mediator mediator, String name) {
	        super(mediator, name);
	    }

	    @Override
	    public void send(String message) {
	        System.out.println(this.name + " invia: " + message);
	        mediator.sendMessage(message, this);
	    }

	    @Override
	    public void receive(String message) {
	        System.out.println(this.name + " riceve: " + message);
	    }
}
