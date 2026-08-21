public class Java_20260821_COR_Director
        extends Java_20260821_COR_Approver {

    @Override
    public void processRequest(
            Java_20260821_COR_Purchase purchase) {

        if (purchase.getAmount() <= 1000) {

            System.out.println(
                    "Director approved purchase #" +
                    purchase.getNumber() +
                    " for $" +
                    purchase.getAmount());

        } else if (successor != null) {

            successor.processRequest(purchase);
        }
    }
}

