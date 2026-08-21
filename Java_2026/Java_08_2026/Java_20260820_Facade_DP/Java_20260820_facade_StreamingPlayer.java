public class Java_20260820_facade_StreamingPlayer {

    private String description;

    public Java_20260820_facade_StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void play(String movie) {
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println(description + " stopped");
    }

    public void pause() {
        System.out.println(description + " paused");
    }
}

