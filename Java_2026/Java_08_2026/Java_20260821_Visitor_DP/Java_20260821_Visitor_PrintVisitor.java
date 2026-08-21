public class Java_20260821_Visitor_PrintVisitor implements Java_20260821_Visitor_ComputerPartVisitor {

    @Override
    public void visit(Java_20260821_Visitor_Computer computer) {
        System.out.println("Visiting Computer");
    }

    @Override
    public void visit(Java_20260821_Visitor_Keyboard keyboard) {
        System.out.println("Visiting Keyboard");
    }

    @Override
    public void visit(Java_20260821_Visitor_Mouse mouse) {
        System.out.println("Visiting Mouse");
    }

    @Override
    public void visit(Java_20260821_Visitor_Monitor monitor) {
        System.out.println("Visiting Monitor");
    }
}

