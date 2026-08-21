public class Java_20260820_composite_Waitress {

    private Java_20260820_composite_MenuComponent allMenus;

    public Java_20260820_composite_Waitress(Java_20260820_composite_MenuComponent allMenus) {

        this.allMenus = allMenus;
    }

    public void printMenu() {

        allMenus.print();
    }
}

