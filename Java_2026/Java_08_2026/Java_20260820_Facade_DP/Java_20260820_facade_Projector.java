public class Java_20260820_facade_Projector {

    private String description;

    public Java_20260820_facade_Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setInput(String input) {
        System.out.println(description + " setting input to " + input);
    }

    public void wideScreenMode() {
        System.out.println(description + " widescreen mode on");
    }
}

