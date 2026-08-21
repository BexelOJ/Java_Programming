public class Java_20260818_proxy_GumballMachine implements Java_20260818_proxy_GumballMachineRemote {

    private String location;
    private int count;
    private String state;

    public Java_20260818_proxy_GumballMachine(String location, int count) {

        this.location = location;
        this.count = count;

        if (count > 0) {
            state = "No Quarter";
        }
        else {
            state = "Sold Out";
        }
    }

    @Override
    public int getCount() {
        return count;

    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getState() {
        return state;
    }
}

