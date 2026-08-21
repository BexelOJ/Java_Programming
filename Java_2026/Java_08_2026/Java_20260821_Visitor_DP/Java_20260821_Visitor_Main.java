public class Java_20260821_Visitor_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create Computer
        //---------------------------------------------------

        Java_20260821_Visitor_Computer computer =
                new Java_20260821_Visitor_Computer();


        //---------------------------------------------------
        // Create Visitor
        //---------------------------------------------------

        Java_20260821_Visitor_ComputerPartVisitor visitor =
                new Java_20260821_Visitor_PrintVisitor();


        //---------------------------------------------------
        // Accept Visitor
        //---------------------------------------------------

        computer.accept(visitor);
    }
}

