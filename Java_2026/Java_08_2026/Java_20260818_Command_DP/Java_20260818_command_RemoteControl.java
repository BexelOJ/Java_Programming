public class Java_20260818_command_RemoteControl {

    private Java_20260818_command_Command slot;
    private Java_20260818_command_Command undoCommand;

    public Java_20260818_command_RemoteControl() {

        slot = new Java_20260818_command_NoCommand();
        undoCommand = new Java_20260818_command_NoCommand();
    }

    public void setCommand(Java_20260818_command_Command command) {
        slot = command;
    }

    public void pressButton() {

        slot.execute();
        undoCommand = slot;
    }

    public void pressUndo() {

        undoCommand.undo();
    }
}

