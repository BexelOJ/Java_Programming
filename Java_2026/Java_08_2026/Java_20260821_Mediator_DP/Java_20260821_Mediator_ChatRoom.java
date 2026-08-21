import java.util.ArrayList;
import java.util.List;

public class Java_20260821_Mediator_ChatRoom {

    private List<Java_20260821_Mediator_User> users;

    public Java_20260821_Mediator_ChatRoom() {

        users = new ArrayList<>();
    }

    public void registerUser(Java_20260821_Mediator_User user) {

        users.add(user);

        System.out.println(
                user.getName() +
                " joined the chat room.");
    }

    public void sendMessage(String message, Java_20260821_Mediator_User sender) {

        for (Java_20260821_Mediator_User user : users) {

            if (user != sender) {

                user.receiveMessage(
                        sender.getName(),
                        message);
            }
        }
    }
}

