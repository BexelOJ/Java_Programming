import java.util.HashMap;
import java.util.Map;

public class Java_20260821_Interpreter_Context {

    private Map<String, Boolean> variables;

    public Java_20260821_Interpreter_Context() {

        variables = new HashMap<>();
    }

    public void setVariable(
            String name,
            boolean value) {

        variables.put(name, value);
    }

    public boolean getVariable(String name) {

        return variables.getOrDefault(name, false);
    }
}

