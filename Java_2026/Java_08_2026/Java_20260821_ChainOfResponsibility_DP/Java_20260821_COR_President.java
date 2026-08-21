public class Java_20260821_COR_President
        extends Java_20260821_COR_Approver {

    @Override
    public void processRequest(
            Java_20260821_COR_Purchase purchase) {

        if (purchase.getAmount() <= 10000) {

            System.out.println(
                    "President approved purchase #" +
                    purchase.getNumber() +
                    " for $" +
                    purchase.getAmount());

        } else {

            System.out.println(
                    "Purchase #" +
                    purchase.getNumber() +
                    " for $" +
                    purchase.getAmount() +
                    " requires higher approval.");
        }
    }
}

