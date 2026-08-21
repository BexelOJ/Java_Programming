public class Java_20260821_Builder_HouseBuilder {

    private Java_20260821_Builder_House house;

    public Java_20260821_Builder_HouseBuilder() {

        house = new Java_20260821_Builder_House();
    }

    public Java_20260821_Builder_HouseBuilder buildWalls() {

        house.setWalls("Brick Walls");

        return this;
    }

    public Java_20260821_Builder_HouseBuilder buildDoors() {

        house.setDoors("Wooden Doors");

        return this;
    }

    public Java_20260821_Builder_HouseBuilder buildWindows() {

        house.setWindows("Glass Windows");

        return this;
    }

    public Java_20260821_Builder_HouseBuilder buildRoof() {

        house.setRoof("Concrete Roof");

        return this;
    }

    public Java_20260821_Builder_HouseBuilder buildGarage() {

        house.setGarage("Two-Car Garage");

        return this;
    }

    public Java_20260821_Builder_HouseBuilder buildGarden() {

        house.setGarden("Front Garden");

        return this;
    }

    public Java_20260821_Builder_House build() {

        return house;
    }
}

