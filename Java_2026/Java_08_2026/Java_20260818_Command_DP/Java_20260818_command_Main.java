public class Java_20260818_command_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create receivers
        //---------------------------------------------------

        Java_20260818_command_Light livingRoomLight =
                new Java_20260818_command_Light("Living Room");

        Java_20260818_command_GarageDoor garageDoor =
                new Java_20260818_command_GarageDoor("Garage");

        //---------------------------------------------------
        // Create commands
        //---------------------------------------------------

        Java_20260818_command_Command livingRoomLightOn =
                new Java_20260818_command_LightOnCommand(livingRoomLight);

        Java_20260818_command_Command livingRoomLightOff =
                new Java_20260818_command_LightOffCommand(livingRoomLight);

        Java_20260818_command_Command garageDoorOpen =
                new Java_20260818_command_GarageDoorOpenCommand(garageDoor);

        //---------------------------------------------------
        // Create remote
        //---------------------------------------------------

        Java_20260818_command_RemoteControl remote =
                new Java_20260818_command_RemoteControl();

        //---------------------------------------------------
        // Light ON
        //---------------------------------------------------

        remote.setCommand(livingRoomLightOn);

        System.out.println("Pressing Light ON button:");
        remote.pressButton();

        //---------------------------------------------------
        // Undo
        //---------------------------------------------------

        System.out.println("Pressing Undo:");
        remote.pressUndo();

        //---------------------------------------------------
        // Light OFF
        //---------------------------------------------------

        remote.setCommand(livingRoomLightOff);

        System.out.println("\nPressing Light OFF button:");
        remote.pressButton();

        //---------------------------------------------------
        // Garage Door
        //---------------------------------------------------

        remote.setCommand(garageDoorOpen);

        System.out.println("\nPressing Garage Door OPEN button:");
        remote.pressButton();

        //---------------------------------------------------
        // Undo
        //---------------------------------------------------

        System.out.println("Pressing Undo:");
        remote.pressUndo();
    }
}

