public class Java_20260818_command_LightOffCommand implements Java_20260818_command_Command {

    private Java_20260818_command_Light light;

    public Java_20260818_command_LightOffCommand(Java_20260818_command_Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

