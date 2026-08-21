public class Java_20260818_command_GarageDoor {

    private String location;

    public Java_20260818_command_GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage door is UP");
    }

    public void down() {
        System.out.println(location + " garage door is DOWN");
    }

    public void stop() {
        System.out.println(location + " garage door is STOPPED");
    }

    public void lightOn() {
        System.out.println(location + " garage light is ON");
    }

    public void lightOff() {
        System.out.println(location + " garage light is OFF");
    }
}

