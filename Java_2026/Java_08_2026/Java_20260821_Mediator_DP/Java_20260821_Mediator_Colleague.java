public abstract class Java_20260821_Mediator_Colleague {

    protected Java_20260821_Mediator_ChatRoom mediator;
    protected String name;

    public Java_20260821_Mediator_Colleague(Java_20260821_Mediator_ChatRoom mediator, String name) {

        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(
            String sender,
            String message);
}

