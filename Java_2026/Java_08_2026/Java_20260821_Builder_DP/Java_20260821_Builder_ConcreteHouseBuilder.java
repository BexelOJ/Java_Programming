public class Java_20260821_Builder_ConcreteHouseBuilder
        implements Java_20260821_Builder_Builder {

    private Java_20260821_Builder_House house;

    public Java_20260821_Builder_ConcreteHouseBuilder() {

        house = new Java_20260821_Builder_House();
    }

    @Override
    public void buildWalls() {

        house.setWalls("Brick Walls");
    }

    @Override
    public void buildDoors() {

        house.setDoors("Wooden Doors");
    }

    @Override
    public void buildWindows() {

        house.setWindows("Glass Windows");
    }

    @Override
    public void buildRoof() {

        house.setRoof("Concrete Roof");
    }

    @Override
    public void buildGarage() {

        house.setGarage("Two-Car Garage");
    }

    @Override
    public void buildGarden() {

        house.setGarden("Front Garden");
    }

    @Override
    public Java_20260821_Builder_House getHouse() {

        return house;
    }
}

