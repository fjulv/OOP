package Library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private final ArrayList<String> catalog = new ArrayList<>();
    private Book book;

    public void addBook(String book) {
        catalog.add(book);
    }

    public void removeBook(String book) {
        catalog.remove(book);
    }

    public ArrayList displayAvailableBooks() {
        ArrayList<String> availableBooks = new ArrayList<>();
        if (book.isAvailable()) {
            availableBooks.add(String.valueOf(book));
        }
        return availableBooks;
    }
}
