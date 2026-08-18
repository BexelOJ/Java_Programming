class Java_20260813_composition_Car {

    private Java_20260813_composition_Engine engine;

    Java_20260813_composition_Car() {
        engine = new Java_20260813_composition_Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Car starting");
    }
}

