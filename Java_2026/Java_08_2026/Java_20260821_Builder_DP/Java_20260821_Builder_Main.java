public class Java_20260821_Builder_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Using Builder directly
        //---------------------------------------------------

        Java_20260821_Builder_House house =
                new Java_20260821_Builder_HouseBuilder()
                        .buildWalls()
                        .buildDoors()
                        .buildWindows()
                        .buildRoof()
                        .buildGarage()
                        .buildGarden()
                        .build();

        house.showHouse();


        //---------------------------------------------------
        // Using Director + Builder
        //---------------------------------------------------

        Java_20260821_Builder_Builder builder =
                new Java_20260821_Builder_ConcreteHouseBuilder();

        Java_20260821_Builder_Director director =
                new Java_20260821_Builder_Director();

        director.constructHouse(builder);

        Java_20260821_Builder_House house2 =
                builder.getHouse();

        house2.showHouse();
    }
}

