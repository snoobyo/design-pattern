package com.wind.dp.behavior.iterator.core;

/**
 * @author wind
 */
public class NameRepository implements Container {

    private String[] data = {"A", "B", "C", "D"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return (index < data.length)? true : false;
        }

        @Override
        public Object next() {
            return hasNext()? data[index++] : null;
        }
    }
}
