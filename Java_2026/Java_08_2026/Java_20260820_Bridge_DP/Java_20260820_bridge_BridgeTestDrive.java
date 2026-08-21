public class Java_20260820_bridge_BridgeTestDrive {

    public static void main(String[] args) {

        //---------------------------------------------------
        // TV + Basic Remote
        //---------------------------------------------------

        Java_20260820_bridge_TV tv = new Java_20260820_bridge_TV();

        Java_20260820_bridge_RemoteControl remote = new Java_20260820_bridge_RemoteControl(tv);

        remote.togglePower();

        remote.volumeUp();

        remote.channelUp();

        remote.togglePower();

        //---------------------------------------------------
        // Radio + Basic Remote
        //---------------------------------------------------

        Java_20260820_bridge_Radio radio = new Java_20260820_bridge_Radio();

        remote = new Java_20260820_bridge_RemoteControl(radio);

        remote.togglePower();

        remote.volumeDown();

        remote.channelDown();

        //---------------------------------------------------
        // TV + Advanced Remote
        //---------------------------------------------------

        Java_20260820_bridge_AdvancedRemoteControl advancedRemote = new Java_20260820_bridge_AdvancedRemoteControl(tv);

        advancedRemote.togglePower();

        advancedRemote.mute();
    }
}

