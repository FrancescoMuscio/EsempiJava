package Mediator;

public abstract class User { //può essere anche una interfaccia. E' il Colleague
	
	 protected Mediator mediator;
	 protected String name;

	 public User(Mediator mediator, String name) {
		 this.mediator = mediator;
		 this.name = name;
	 }

	 public abstract void send(String message);
	 public abstract void receive(String message);
}
