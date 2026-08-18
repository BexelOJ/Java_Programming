public class Java_20260816_state_NoQuarterState implements Java_20260816_state_State {

    private Java_20260816_state_GumballMachine machine;

    public Java_20260816_state_NoQuarterState(Java_20260816_state_GumballMachine machine) {
        this.machine = machine;
    }

    //---------------------------------------------------
    // Insert quarter
    //---------------------------------------------------

    @Override
    public void insertQuarter() {

        System.out.println("You inserted a quarter.");

        machine.setState(machine.getHasQuarterState());
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

        System.out.println("You turned, but there's no quarter.");
    }

    //---------------------------------------------------
    // Dispense
    //---------------------------------------------------

    @Override
    public void dispense() {

        System.out.println("You need to pay first.");
    }
}

