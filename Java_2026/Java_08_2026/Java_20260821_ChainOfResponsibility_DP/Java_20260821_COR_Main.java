public class Java_20260821_COR_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create the approvers
        //---------------------------------------------------

        Java_20260821_COR_Approver director =
                new Java_20260821_COR_Director();

        Java_20260821_COR_Approver vicePresident =
                new Java_20260821_COR_VicePresident();

        Java_20260821_COR_Approver president =
                new Java_20260821_COR_President();


        //---------------------------------------------------
        // Build the chain
        //---------------------------------------------------

        director.setSuccessor(vicePresident);

        vicePresident.setSuccessor(president);


        //---------------------------------------------------
        // Create purchases
        //---------------------------------------------------

        Java_20260821_COR_Purchase purchase1 =
                new Java_20260821_COR_Purchase(
                        1,
                        500,
                        "Office supplies");

        Java_20260821_COR_Purchase purchase2 =
                new Java_20260821_COR_Purchase(
                        2,
                        2500,
                        "New computer");

        Java_20260821_COR_Purchase purchase3 =
                new Java_20260821_COR_Purchase(
                        3,
                        7000,
                        "New server");

        Java_20260821_COR_Purchase purchase4 =
                new Java_20260821_COR_Purchase(
                        4,
                        15000,
                        "New data center equipment");


        //---------------------------------------------------
        // Process purchases
        //---------------------------------------------------

        director.processRequest(purchase1);

        director.processRequest(purchase2);

        director.processRequest(purchase3);

        director.processRequest(purchase4);
    }
}

