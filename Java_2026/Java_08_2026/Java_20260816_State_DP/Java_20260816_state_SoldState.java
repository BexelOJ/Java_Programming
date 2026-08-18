public class Java_20260816_state_SoldState implements Java_20260816_state_State {

    private Java_20260816_state_GumballMachine machine;

    public Java_20260816_state_SoldState(Java_20260816_state_GumballMachine machine) {
        this.machine = machine;
    }

    //---------------------------------------------------
    // Insert quarter
    //---------------------------------------------------

    @Override
    public void insertQuarter() {

        System.out.println("Please wait, we're already giving you a gumball.");
    }

    //---------------------------------------------------
    // Eject quarter
    //---------------------------------------------------

    @Override
    public void ejectQuarter() {

        System.out.println("Sorry, you already turned the crank.");
    }

    //---------------------------------------------------
    // Turn crank
    //---------------------------------------------------

    @Override
    public void turnCrank() {

        System.out.println("Turning twice doesn't get you another gumball.");
    }

    //---------------------------------------------------
    // Dispense
    //---------------------------------------------------

    @Override
    public void dispense() {

        machine.releaseBall();

        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        }
        else {
            System.out.println("Oops, out of gumballs!");

            machine.setState(machine.getSoldOutState());
        }
    }
}

