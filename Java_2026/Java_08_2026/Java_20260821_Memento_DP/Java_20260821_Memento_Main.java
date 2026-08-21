public class Java_20260821_Memento_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create Originator
        //---------------------------------------------------

        Java_20260821_Memento_Originator editor =
                new Java_20260821_Memento_Originator();


        //---------------------------------------------------
        // Create Caretaker
        //---------------------------------------------------

        Java_20260821_Memento_Caretaker history =
                new Java_20260821_Memento_Caretaker();


        //---------------------------------------------------
        // State 1
        //---------------------------------------------------

        editor.setState("State 1");

        history.save(
                editor.createMemento());


        //---------------------------------------------------
        // State 2
        //---------------------------------------------------

        editor.setState("State 2");

        history.save(
                editor.createMemento());


        //---------------------------------------------------
        // State 3
        //---------------------------------------------------

        editor.setState("State 3");

        history.save(
                editor.createMemento());


        //---------------------------------------------------
        // Current state
        //---------------------------------------------------

        System.out.println();

        System.out.println(
                "Current state: " +
                editor.getState());


        //---------------------------------------------------
        // Undo
        //---------------------------------------------------

        System.out.println();

        Java_20260821_Memento_Memento memento =
                history.undo();

        editor.restoreFromMemento(memento);


        //---------------------------------------------------
        // Undo again
        //---------------------------------------------------

        System.out.println();

        memento = history.undo();

        editor.restoreFromMemento(memento);
    }
}

