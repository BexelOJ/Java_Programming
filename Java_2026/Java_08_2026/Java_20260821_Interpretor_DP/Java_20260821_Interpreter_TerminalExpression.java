public class Java_20260821_Interpreter_TerminalExpression
        implements Java_20260821_Interpreter_Expression {

    private String variable;

    public Java_20260821_Interpreter_TerminalExpression(
            String variable) {

        this.variable = variable;
    }

    @Override
    public boolean interpret(
            Java_20260821_Interpreter_Context context) {

        return context.getVariable(variable);
    }
}

