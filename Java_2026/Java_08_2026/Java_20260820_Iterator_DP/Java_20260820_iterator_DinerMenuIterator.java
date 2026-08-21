public class Java_20260820_iterator_DinerMenuIterator implements Java_20260820_iterator_Iterator {

    Java_20260820_iterator_MenuItem[] items;

    int position = 0;

    public Java_20260820_iterator_DinerMenuIterator(Java_20260820_iterator_MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        if (position >= items.length || items[position] == null) {
            return false;
        }

        return true;
    }

    @Override
    public Java_20260820_iterator_MenuItem next() {

        Java_20260820_iterator_MenuItem menuItem = items[position];

        position++;

        return menuItem;
    }
}

