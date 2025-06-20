package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator { //ConcreteMediator
	
	private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // L'utente non riceve i propri messaggi
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
