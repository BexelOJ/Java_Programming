public class Java_20260818_proxy_GumballMonitor {

    private Java_20260818_proxy_GumballMachineRemote machine;

    public Java_20260818_proxy_GumballMonitor(Java_20260818_proxy_GumballMachineRemote machine) {

        this.machine = machine;
    }

    public void report() {

        System.out.println("\n================================");
        System.out.println("GUMBALL MACHINE REPORT");
        System.out.println("================================");

        System.out.println(
            "Location: " + machine.getLocation()
        );

        System.out.println(
            "State: " + machine.getState()
        );

        System.out.println(
            "Gumballs: " + machine.getCount()
        );
    }
}

