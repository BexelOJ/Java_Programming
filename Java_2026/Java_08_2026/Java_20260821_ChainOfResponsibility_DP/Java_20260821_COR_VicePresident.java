public class Java_20260821_COR_VicePresident
        extends Java_20260821_COR_Approver {

    @Override
    public void processRequest(
            Java_20260821_COR_Purchase purchase) {

        if (purchase.getAmount() <= 5000) {

            System.out.println(
                    "Vice President approved purchase #" +
                    purchase.getNumber() +
                    " for $" +
                    purchase.getAmount());

        } else if (successor != null) {

            successor.processRequest(purchase);
        }
    }
}

