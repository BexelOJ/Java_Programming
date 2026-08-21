public class Java_20260821_Builder_House {

    private String walls;
    private String doors;
    private String windows;
    private String roof;
    private String garage;
    private String garden;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public void showHouse() {

        System.out.println();
        System.out.println("===== HOUSE =====");

        System.out.println("Walls   : " + walls);
        System.out.println("Doors   : " + doors);
        System.out.println("Windows : " + windows);
        System.out.println("Roof    : " + roof);
        System.out.println("Garage  : " + garage);
        System.out.println("Garden  : " + garden);
    }
}

