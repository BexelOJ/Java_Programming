public class Java_20260820_facade_Amplifier {

    private String description;

    public Java_20260820_facade_Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStreamingPlayer(String player) {
        System.out.println(description + " setting Streaming Player to " + player);
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo sound on");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }
}

