public class Java_20260821_Prototype_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Create Prototype Registry
        //---------------------------------------------------

        Java_20260821_Prototype_AnimalRegistry registry =
                new Java_20260821_Prototype_AnimalRegistry();


        //---------------------------------------------------
        // Clone Sheep
        //---------------------------------------------------

        Java_20260821_Prototype_Animal sheep1 =
                registry.getAnimal("sheep");

        Java_20260821_Prototype_Animal sheep2 =
                registry.getAnimal("sheep");


        //---------------------------------------------------
        // Clone Cow
        //---------------------------------------------------

        Java_20260821_Prototype_Animal cow1 =
                registry.getAnimal("cow");


        //---------------------------------------------------
        // Display
        //---------------------------------------------------

        sheep1.showAnimal();

        sheep2.showAnimal();

        cow1.showAnimal();


        //---------------------------------------------------
        // Verify different objects
        //---------------------------------------------------

        System.out.println();

        System.out.println(
                "sheep1 == sheep2 : " +
                (sheep1 == sheep2));

        System.out.println(
                "sheep1 == sheep1 : " +
                (sheep1 == sheep1));
    }
}