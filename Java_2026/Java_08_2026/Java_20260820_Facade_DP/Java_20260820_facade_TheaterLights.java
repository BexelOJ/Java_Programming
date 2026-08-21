public class Java_20260820_facade_TheaterLights {

    private String description;

    public Java_20260820_facade_TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void dim(int percent) {
        System.out.println(description + " dimming to " + percent + "%");
    }
}

