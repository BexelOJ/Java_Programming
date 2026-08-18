public class Java_20260816_state_GumballMachine {

    //---------------------------------------------------
    // States
    //---------------------------------------------------

    Java_20260816_state_State noQuarterState;
    Java_20260816_state_State hasQuarterState;
    Java_20260816_state_State soldState;
    Java_20260816_state_State soldOutState;

    //---------------------------------------------------
    // Current state
    //---------------------------------------------------

    Java_20260816_state_State state;

    //---------------------------------------------------
    // Number of gumballs
    //---------------------------------------------------

    int count;

    //---------------------------------------------------
    // Constructor
    //---------------------------------------------------

    public Java_20260816_state_GumballMachine(int numberOfGumballs) {

        noQuarterState = new Java_20260816_state_NoQuarterState(this);
        hasQuarterState = new Java_20260816_state_HasQuarterState(this);
        soldState = new Java_20260816_state_SoldState(this);
        soldOutState = new Java_20260816_state_SoldOutState(this);

        count = numberOfGumballs;

        if (count > 0) {
            state = noQuarterState;
        }
        else {
            state = soldOutState;
        }
    }

    //---------------------------------------------------
    // Operations
    //---------------------------------------------------

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {

        if (count > 0) {
            count--;
            System.out.println("A gumball comes rolling out!");
        }
    }

    //---------------------------------------------------
    // State setters
    //---------------------------------------------------

    public void setState(Java_20260816_state_State state) {
        this.state = state;
    }

    public Java_20260816_state_State getNoQuarterState() {
        return noQuarterState;
    }

    public Java_20260816_state_State getHasQuarterState() {
        return hasQuarterState;
    }

    public Java_20260816_state_State getSoldState() {
        return soldState;
    }

    public Java_20260816_state_State getSoldOutState() {
        return soldOutState;
    }

    //---------------------------------------------------
    // Getters
    //---------------------------------------------------

    public int getCount() {
        return count;
    }
}

