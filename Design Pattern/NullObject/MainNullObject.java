package NullObject;

public class MainNullObject {

	public static void main(String[] args) {

		// Utente con una notifica email
        User user1 = new User("Alice", new EmailNotification("alice@example.com"));
        
        // Utente senza notifiche
        User user2 = new User("Bob", new NullNotification());

        // Invio notifiche
        user1.notify("Benvenuto, Alice!");
        user2.notify("Benvenuto, Bob!");

	}

}
