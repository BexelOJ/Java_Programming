public class Java_20260818_command_LightOnCommand implements Java_20260818_command_Command {

    private Java_20260818_command_Light light;

    public Java_20260818_command_LightOnCommand(Java_20260818_command_Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

