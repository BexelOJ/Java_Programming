public class Java_20260818_command_Light {

    private String location;

    public Java_20260818_command_Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is ON");
    }

    public void off() {
        System.out.println(location + " light is OFF");
    }
}

