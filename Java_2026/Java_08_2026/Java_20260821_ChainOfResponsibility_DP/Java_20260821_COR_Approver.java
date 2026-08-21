public abstract class Java_20260821_COR_Approver {

    protected Java_20260821_COR_Approver successor;

    public void setSuccessor(
            Java_20260821_COR_Approver successor) {

        this.successor = successor;
    }

    public abstract void processRequest(
            Java_20260821_COR_Purchase purchase);
}

