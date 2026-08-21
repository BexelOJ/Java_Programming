public class Java_20260821_Memento_Originator {

    private String state;

    public void setState(String state) {

        this.state = state;

        System.out.println(
                "State changed to: " + state);
    }

    public String getState() {

        return state;
    }

    //---------------------------------------------------
    // Create Memento
    //---------------------------------------------------

    public Java_20260821_Memento_Memento createMemento() {

        System.out.println(
                "Saving state: " + state);

        return new Java_20260821_Memento_Memento(state);
    }

    //---------------------------------------------------
    // Restore from Memento
    //---------------------------------------------------

    public void restoreFromMemento(
            Java_20260821_Memento_Memento memento) {

        state = memento.getState();

        System.out.println(
                "Restored state to: " + state);
    }
}

