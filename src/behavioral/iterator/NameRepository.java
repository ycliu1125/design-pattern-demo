package behavioral.iterator;

public class NameRepository implements Container {

    public String[] names = {"Anny", "Bob", "Charles", "Dan"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return hasNext() ? names[index++] : null;
        }
    }
}
