public class Java_20260820_bridge_Radio implements Java_20260820_bridge_Device {

    private boolean on = false;
    private int volume = 10;
    private int channel = 1;

    @Override
    public void turnOn() {

        on = true;

        System.out.println("Radio turned ON");
    }

    @Override
    public void turnOff() {

        on = false;

        System.out.println("Radio turned OFF");
    }

    @Override
    public void setVolume(int volume) {

        this.volume = volume;

        System.out.println("Radio volume = " + volume);
    }

    @Override
    public void setChannel(int channel) {

        this.channel = channel;

        System.out.println("Radio channel = " + channel);
    }

    @Override
    public boolean isEnabled() {

        return on;
    }
}

