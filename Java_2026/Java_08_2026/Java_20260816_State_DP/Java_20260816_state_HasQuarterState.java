public class Java_20260816_state_HasQuarterState implements Java_20260816_state_State {

    private Java_20260816_state_GumballMachine machine;

    public Java_20260816_state_HasQuarterState(Java_20260816_state_GumballMachine machine) {
        this.machine = machine;
    }

    //---------------------------------------------------
    // Insert quarter
    //---------------------------------------------------

    @Override
    public void insertQuarter() {

        System.out.println("You can't insert another quarter.");
    }

    //---------------------------------------------------
    // Eject quarter
    //---------------------------------------------------

    @Override
    public void ejectQuarter() {

        System.out.println("Quarter returned.");

        machine.setState(machine.getNoQuarterState());
    }

    //---------------------------------------------------
    // Turn crank
    //---------------------------------------------------

    @Override
    public void turnCrank() {

        System.out.println("You turned the crank.");

        machine.setState(machine.getSoldState());
    }

    //---------------------------------------------------
    // Dispense
    //---------------------------------------------------

    @Override
    public void dispense() {

        System.out.println("No gumball dispensed.");
    }
}

