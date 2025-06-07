package Mediator;

public class MainMediator {

	public static void main(String[] args) {

		Mediator chatRoom = new ChatRoom();

        User user1 = new ConcreteUser(chatRoom, "Alice");
        User user2 = new ConcreteUser(chatRoom, "Bob");
        User user3 = new ConcreteUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Ciao a tutti!");
        user2.send("Ciao Alice!");

	}

}
