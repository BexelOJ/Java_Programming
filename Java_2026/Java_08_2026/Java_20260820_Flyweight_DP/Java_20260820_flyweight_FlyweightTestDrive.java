public class Java_20260820_flyweight_FlyweightTestDrive {

    public static void main(String[] args) {

        Java_20260820_flyweight_CharacterFactory factory = new Java_20260820_flyweight_CharacterFactory();

        //---------------------------------------------------
        // First A
        //---------------------------------------------------

        Java_20260820_flyweight_Character a1 = factory.getCharacter('A', "Arial", 12);

        a1.display(10, 20);

        //---------------------------------------------------
        // Second A
        //---------------------------------------------------

        Java_20260820_flyweight_Character a2 = factory.getCharacter('A', "Arial", 12);

        a2.display(50, 100);

        //---------------------------------------------------
        // Third A
        //---------------------------------------------------

        Java_20260820_flyweight_Character a3 = factory.getCharacter('A', "Arial", 12);

        a3.display(200, 300);

        //---------------------------------------------------
        // B
        //---------------------------------------------------

        Java_20260820_flyweight_Character b1 = factory.getCharacter('B', "Arial", 12);

        b1.display(400, 500);

        //---------------------------------------------------

        System.out.println("\nNumber of flyweight objects: " + factory.getNumberOfFlyweights());

        //---------------------------------------------------

        System.out.println("\na1 == a2 : " + (a1 == a2));

        System.out.println("a2 == a3 : " + (a2 == a3));
    }
}

