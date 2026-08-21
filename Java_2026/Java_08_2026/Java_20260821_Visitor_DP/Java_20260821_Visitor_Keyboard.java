public class Java_20260821_Visitor_Keyboard implements Java_20260821_Visitor_ComputerPart {

    @Override
    public void accept(Java_20260821_Visitor_ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

