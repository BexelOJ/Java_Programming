public class Java_20260816_state_SoldOutState implements Java_20260816_state_State {

    private Java_20260816_state_GumballMachine machine;

    public Java_20260816_state_SoldOutState(Java_20260816_state_GumballMachine machine) {
        this.machine = machine;
    }

    //---------------------------------------------------
    // Insert quarter
    //---------------------------------------------------

    @Override
    public void insertQuarter() {

        System.out.println("Sorry, the machine is sold out.");
    }

    //---------------------------------------------------
    // Eject quarter
    //---------------------------------------------------

    @Override
    public void ejectQuarter() {

        System.out.println("You haven't inserted a quarter.");
    }

    //---------------------------------------------------
    // Turn crank
    //---------------------------------------------------

    @Override
    public void turnCrank() {

        System.out.println("You turned, but there are no gumballs.");
    }

    //---------------------------------------------------
    // Dispense
    //---------------------------------------------------

    @Override
    public void dispense() {

        System.out.println("No gumball dispensed.");
    }
}

