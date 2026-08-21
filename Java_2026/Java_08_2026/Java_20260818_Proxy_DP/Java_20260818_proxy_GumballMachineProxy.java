public class Java_20260818_proxy_GumballMachineProxy
        implements Java_20260818_proxy_GumballMachineRemote {

    private Java_20260818_proxy_GumballMachineRemote remoteMachine;

    public Java_20260818_proxy_GumballMachineProxy(
            Java_20260818_proxy_GumballMachineRemote remoteMachine) {

        this.remoteMachine = remoteMachine;
    }

    @Override
    public int getCount() {

        System.out.println(
            "Proxy: Requesting count from remote machine..."
        );

        return remoteMachine.getCount();
    }

    @Override
    public String getLocation() {

        System.out.println(
            "Proxy: Requesting location from remote machine..."
        );

        return remoteMachine.getLocation();
    }

    @Override
    public String getState() {

        System.out.println(
            "Proxy: Requesting state from remote machine..."
        );

        return remoteMachine.getState();
    }
}

