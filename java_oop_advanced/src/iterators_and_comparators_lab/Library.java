package iterators_and_comparators_lab;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator<Book> {

        private int counter;

        @Override
        public boolean hasNext() {
            if(this.counter < books.length) { return true; }
            return false;
        }

        @Override
        public Book next() {
            counter++;
            return books[counter - 1];
        }
    }
}
