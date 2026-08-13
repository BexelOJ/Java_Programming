class java_20260813_Car_composition {

    private java_20260813_Engine_composition engine;

    java_20260813_Car_composition() {
        engine = new java_20260813_Engine_composition();
    }

    public void start() {
        engine.start();
        System.out.println("Car starting");
    }
}

