import java.util.ArrayList;
import java.util.List;

public class Java_20260821_Memento_Caretaker {

    private List<Java_20260821_Memento_Memento> history;

    public Java_20260821_Memento_Caretaker() {

        history = new ArrayList<>();
    }

    public void save(
            Java_20260821_Memento_Memento memento) {

        history.add(memento);
    }

    public Java_20260821_Memento_Memento undo() {

        if (history.isEmpty()) {

            return null;
        }

        int lastIndex = history.size() - 1;

        Java_20260821_Memento_Memento memento =
                history.get(lastIndex);

        history.remove(lastIndex);

        return memento;
    }
}

