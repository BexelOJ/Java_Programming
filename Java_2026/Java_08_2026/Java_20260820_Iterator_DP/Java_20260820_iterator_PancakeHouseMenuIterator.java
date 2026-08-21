import java.util.ArrayList;

public class Java_20260820_iterator_PancakeHouseMenuIterator implements Java_20260820_iterator_Iterator {

    ArrayList<Java_20260820_iterator_MenuItem> items;

    int position = 0;

    public Java_20260820_iterator_PancakeHouseMenuIterator(ArrayList<Java_20260820_iterator_MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        if (position >= items.size()) {
            return false;
        }

        return true;
    }

    @Override
    public Java_20260820_iterator_MenuItem next() {

        Java_20260820_iterator_MenuItem menuItem = items.get(position);

        position++;

        return menuItem;
    }
}

