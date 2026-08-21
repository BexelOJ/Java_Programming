public class Java_20260820_iterator_Waitress {

    Java_20260820_iterator_PancakeHouseMenu pancakeHouseMenu;
    Java_20260820_iterator_DinerMenu dinerMenu;

    public Java_20260820_iterator_Waitress(Java_20260820_iterator_PancakeHouseMenu pancakeHouseMenu,
                    Java_20260820_iterator_DinerMenu dinerMenu) {

        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {

        Java_20260820_iterator_Iterator pancakeIterator = pancakeHouseMenu.createIterator();

        Java_20260820_iterator_Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----");

        printMenu(pancakeIterator);

        printMenu(dinerIterator);
    }

    private void printMenu(Java_20260820_iterator_Iterator iterator) {

        while (iterator.hasNext()) {

            Java_20260820_iterator_MenuItem menuItem = iterator.next();

            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
    }
}

