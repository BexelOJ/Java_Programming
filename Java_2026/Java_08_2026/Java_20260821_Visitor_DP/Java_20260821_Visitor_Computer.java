public class Java_20260821_Visitor_Computer implements Java_20260821_Visitor_ComputerPart {

    private Java_20260821_Visitor_ComputerPart[] parts;

    public Java_20260821_Visitor_Computer() {

        parts = new Java_20260821_Visitor_ComputerPart[] {

                new Java_20260821_Visitor_Keyboard(),
                new Java_20260821_Visitor_Mouse(),
                new Java_20260821_Visitor_Monitor()
        };
    }

    public Java_20260821_Visitor_ComputerPart[] getParts() {

        return parts;
    }

    @Override
    public void accept(Java_20260821_Visitor_ComputerPartVisitor visitor) {

        for (Java_20260821_Visitor_ComputerPart part : parts) {
            part.accept(visitor);
        }

        visitor.visit(this);
    }
}

