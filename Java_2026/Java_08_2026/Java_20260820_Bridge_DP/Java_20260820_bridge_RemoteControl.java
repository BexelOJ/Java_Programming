public class Java_20260820_bridge_RemoteControl {

    protected Java_20260820_bridge_Device device;

    public Java_20260820_bridge_RemoteControl(Java_20260820_bridge_Device device) {

        this.device = device;
    }

    public void togglePower() {

        if (device.isEnabled()) {

            device.turnOff();

        } else {

            device.turnOn();
        }
    }

    public void volumeDown() {

        device.setVolume(5);
    }

    public void volumeUp() {

        device.setVolume(15);
    }

    public void channelDown() {

        device.setChannel(1);
    }

    public void channelUp() {

        device.setChannel(2);
    }
}

