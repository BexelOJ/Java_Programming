public class Java_20260820_iterator_MenuItem {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public Java_20260820_iterator_MenuItem(String name, String description, boolean vegetarian, double price) {

        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}

