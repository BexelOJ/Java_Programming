public class Java_20260820_iterator_DinerMenu {

    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    Java_20260820_iterator_MenuItem[] menuItems;

    public Java_20260820_iterator_DinerMenu() {

        menuItems = new Java_20260820_iterator_MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Bacon with lettuce and tomato", true, 2.99);

        addItem("BLT", "Bacon with lettuce and tomato", false, 2.99);

        addItem("Soup of the day",  "Soup of the day with a side of potato salad", false, 3.29);
    }

    public void addItem(String name,String description, boolean vegetarian, double price) {

        Java_20260820_iterator_MenuItem menuItem = new Java_20260820_iterator_MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {

            System.out.println("Sorry, menu is full");

        } else {

            menuItems[numberOfItems] = menuItem;

            numberOfItems++;
        }
    }

    public Java_20260820_iterator_MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Java_20260820_iterator_Iterator createIterator() {
        return new Java_20260820_iterator_DinerMenuIterator(menuItems);
    }   
}

