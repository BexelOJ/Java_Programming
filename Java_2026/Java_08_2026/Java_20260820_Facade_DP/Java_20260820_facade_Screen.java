public class Java_20260820_facade_Screen {

    private String description;

    public Java_20260820_facade_Screen(String description) {
        this.description = description;
    }

    public void down() {
        System.out.println(description + " going down");
    }

    public void up() {
        System.out.println(description + " going up");
    }
}

