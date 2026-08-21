public class Java_20260820_iterator_Main {

    public static void main(String[] args) {

        Java_20260820_iterator_PancakeHouseMenu pancakeHouseMenu = new Java_20260820_iterator_PancakeHouseMenu();

        Java_20260820_iterator_DinerMenu dinerMenu = new Java_20260820_iterator_DinerMenu();

        Java_20260820_iterator_Waitress waitress = new Java_20260820_iterator_Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}

