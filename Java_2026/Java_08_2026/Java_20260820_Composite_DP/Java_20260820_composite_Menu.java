import java.util.ArrayList;
import java.util.Iterator;

public class Java_20260820_composite_Menu extends Java_20260820_composite_MenuComponent {

    private ArrayList<Java_20260820_composite_MenuComponent> menuComponents;

    private String name;
    private String description;

    public Java_20260820_composite_Menu(String name, String description) {

        this.name = name;
        this.description = description;

        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(Java_20260820_composite_MenuComponent menuComponent) {

        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(Java_20260820_composite_MenuComponent menuComponent) {

        menuComponents.remove(menuComponent);
    }

    @Override
    public Java_20260820_composite_MenuComponent getChild(int index) {

        return menuComponents.get(index);
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
    public void print() {

        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator<Java_20260820_composite_MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()) {

            Java_20260820_composite_MenuComponent menuComponent = iterator.next();

            menuComponent.print();
        }
    }
}

