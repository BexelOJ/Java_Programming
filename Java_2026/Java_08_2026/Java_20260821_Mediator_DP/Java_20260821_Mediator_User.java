public class Java_20260821_Mediator_User extends Java_20260821_Mediator_Colleague {

    public Java_20260821_Mediator_User(Java_20260821_Mediator_ChatRoom mediator, String name) {

        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {

        System.out.println(
                name + " sends: " + message);

        mediator.sendMessage(
                message,
                this);
    }

    @Override
    public void receiveMessage(
            String sender,
            String message) {

        System.out.println(
                name +
                " received from " +
                sender +
                ": " +
                message);
    }
}