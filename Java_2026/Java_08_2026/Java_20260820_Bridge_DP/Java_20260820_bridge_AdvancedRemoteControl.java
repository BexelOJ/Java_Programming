public class Java_20260820_bridge_AdvancedRemoteControl extends Java_20260820_bridge_RemoteControl {

    public Java_20260820_bridge_AdvancedRemoteControl(Java_20260820_bridge_Device device) {
        super(device);
    }

    public void mute() {

        device.setVolume(0);

        System.out.println("Device muted");
    }
}

