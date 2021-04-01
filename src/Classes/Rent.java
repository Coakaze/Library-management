package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Rent {
    protected Reader reader;
    protected ArrayList<Book> books;
    protected LocalDate dateOfRent;
    protected LocalDate dateOfReturn;
    boolean isReturned;

    public Rent(Reader reader, ArrayList<Book> books) {
        this.reader = reader;
        this.books = books;
        LocalDate date = LocalDate.now();
        this.dateOfRent = date;
        this.dateOfReturn = date.plusDays(60);
        this.isReturned = false;
        for(Book book : books)
            book.nCopierAvailable--;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
