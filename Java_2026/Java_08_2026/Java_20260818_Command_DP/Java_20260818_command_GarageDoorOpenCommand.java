public class Java_20260818_command_GarageDoorOpenCommand implements Java_20260818_command_Command {

    private Java_20260818_command_GarageDoor garageDoor;

    public Java_20260818_command_GarageDoorOpenCommand(Java_20260818_command_GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}

