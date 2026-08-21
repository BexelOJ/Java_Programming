public class Java_20260821_Mediator_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create Mediator
        //---------------------------------------------------

        Java_20260821_Mediator_ChatRoom chatRoom = new Java_20260821_Mediator_ChatRoom();


        //---------------------------------------------------
        // Create Users
        //---------------------------------------------------

        Java_20260821_Mediator_User alice = new Java_20260821_Mediator_User(chatRoom, "Alice");

        Java_20260821_Mediator_User bob = new Java_20260821_Mediator_User(chatRoom, "Bob");

        Java_20260821_Mediator_User charlie = new Java_20260821_Mediator_User(chatRoom, "Charlie");


        //---------------------------------------------------
        // Register Users
        //---------------------------------------------------

        chatRoom.registerUser(alice);
        chatRoom.registerUser(bob);
        chatRoom.registerUser(charlie);


        //---------------------------------------------------
        // Send Messages
        //---------------------------------------------------

        System.out.println();

        alice.sendMessage("Hello everyone!");

        System.out.println();

        bob.sendMessage("Hello Alice!");

        System.out.println();

        charlie.sendMessage("Good morning!");
    }
}