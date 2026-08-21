public class Java_20260820_composite_MenuItem extends Java_20260820_composite_MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public Java_20260820_composite_MenuItem(
            String name,
            String description,
            boolean vegetarian,
            double price) {

        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {

        System.out.print("  " + getName());

        if (isVegetarian()) {
            System.out.print(" (v)");
        }

        System.out.println(", " + getPrice());

        System.out.println("     -- " + getDescription());
    }
}

