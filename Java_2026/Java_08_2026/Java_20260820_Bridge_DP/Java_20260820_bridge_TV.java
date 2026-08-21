public class Java_20260820_bridge_TV implements Java_20260820_bridge_Device {

    private boolean on = false;
    private int volume = 10;
    private int channel = 1;

    @Override
    public void turnOn() {

        on = true;

        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {

        on = false;

        System.out.println("TV turned OFF");
    }

    @Override
    public void setVolume(int volume) {

        this.volume = volume;

        System.out.println("TV volume = " + volume);
    }

    @Override
    public void setChannel(int channel) {

        this.channel = channel;

        System.out.println("TV channel = " + channel);
    }

    @Override
    public boolean isEnabled() {

        return on;
    }
}

