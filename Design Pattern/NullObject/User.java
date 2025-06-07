package NullObject;

public class User { //Classe che utilizza il pattern

	private String name;
    private Notification notification;

    public User(String name, Notification notification) {
        this.name = name;
        this.notification = notification;
    }

    public void notify(String message) {
        notification.send(message);
    }
}
