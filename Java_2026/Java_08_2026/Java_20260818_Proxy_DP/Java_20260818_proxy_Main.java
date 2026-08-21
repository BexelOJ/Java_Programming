public class Java_20260818_proxy_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Actual Gumball Machine
        //---------------------------------------------------

        Java_20260818_proxy_GumballMachine machine =
                new Java_20260818_proxy_GumballMachine(
                        "Bangalore",
                        10
                );

        //---------------------------------------------------
        // Create Proxy
        //---------------------------------------------------

        Java_20260818_proxy_GumballMachineRemote proxy =
                new Java_20260818_proxy_GumballMachineProxy(machine);

        //---------------------------------------------------
        // Monitor uses Proxy
        //---------------------------------------------------

        Java_20260818_proxy_GumballMonitor monitor =
                new Java_20260818_proxy_GumballMonitor(proxy);

        //---------------------------------------------------
        // Generate report
        //---------------------------------------------------

        monitor.report();
    }
}

