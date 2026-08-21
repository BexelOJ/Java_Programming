import java.util.ArrayList;

public class Java_20260820_iterator_PancakeHouseMenu {

    ArrayList<Java_20260820_iterator_MenuItem> menuItems;

    public Java_20260820_iterator_PancakeHouseMenu() {

        menuItems = new ArrayList<>();

        addItem("Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        Java_20260820_iterator_MenuItem menuItem = new Java_20260820_iterator_MenuItem(name, description, vegetarian, price);

        menuItems.add(menuItem);
    }

    public ArrayList<Java_20260820_iterator_MenuItem> getMenuItems() {
        return menuItems;
    }

    public Java_20260820_iterator_Iterator createIterator() {
        return new Java_20260820_iterator_PancakeHouseMenuIterator(menuItems);
    }
}

