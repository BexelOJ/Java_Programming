public class Java_20260821_Interpreter_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create Context
        //---------------------------------------------------

        Java_20260821_Interpreter_Context context =
                new Java_20260821_Interpreter_Context();

        context.setVariable("A", true);
        context.setVariable("B", false);


        //---------------------------------------------------
        // Terminal expressions
        //---------------------------------------------------

        Java_20260821_Interpreter_Expression A =
                new Java_20260821_Interpreter_TerminalExpression("A");

        Java_20260821_Interpreter_Expression B =
                new Java_20260821_Interpreter_TerminalExpression("B");


        //---------------------------------------------------
        // A AND B
        //---------------------------------------------------

        Java_20260821_Interpreter_Expression AandB =
                new Java_20260821_Interpreter_AndExpression(A, B);

        System.out.println(
                "A AND B = " +
                AandB.interpret(context));


        //---------------------------------------------------
        // A OR B
        //---------------------------------------------------

        Java_20260821_Interpreter_Expression AorB =
                new Java_20260821_Interpreter_OrExpression(A, B);

        System.out.println(
                "A OR B = " +
                AorB.interpret(context));


        //---------------------------------------------------
        // NOT A
        //---------------------------------------------------

        Java_20260821_Interpreter_Expression notA =
                new Java_20260821_Interpreter_NotExpression(A);

        System.out.println(
                "NOT A = " +
                notA.interpret(context));
    }
}

