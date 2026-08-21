public class Java_20260821_Interpreter_AndExpression
        implements Java_20260821_Interpreter_Expression {

    private Java_20260821_Interpreter_Expression expression1;
    private Java_20260821_Interpreter_Expression expression2;

    public Java_20260821_Interpreter_AndExpression(
            Java_20260821_Interpreter_Expression expression1,
            Java_20260821_Interpreter_Expression expression2) {

        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(
            Java_20260821_Interpreter_Context context) {

        return expression1.interpret(context)
                && expression2.interpret(context);
    }
}

