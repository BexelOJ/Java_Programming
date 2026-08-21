public abstract class Java_20260820_AF_Pizza {

    String name;

    Java_20260820_AF_Dough dough;
    Java_20260820_AF_Sauce sauce;
    Java_20260820_AF_Cheese cheese;

    Java_20260820_AF_Veggies[] veggies;

    Java_20260820_AF_Pepperoni pepperoni;
    Java_20260820_AF_Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

