public class Java_20260821_Interpreter_NotExpression
        implements Java_20260821_Interpreter_Expression {

    private Java_20260821_Interpreter_Expression expression;

    public Java_20260821_Interpreter_NotExpression(
            Java_20260821_Interpreter_Expression expression) {

        this.expression = expression;
    }

    @Override
    public boolean interpret(
            Java_20260821_Interpreter_Context context) {

        return !expression.interpret(context);
    }
}

