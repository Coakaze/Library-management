package Classes;

public class Book implements Comparable<Book> {
    protected String title;
    protected String author;
    protected String genre;
    protected int nCopies;
    protected int nCopierAvailable;
    protected int rating;

    public Book(String title, String author, String genre, int nCopies, int nCopierAvailable, int rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.nCopies = nCopies;
        this.nCopierAvailable = nCopierAvailable;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getnCopies() {
        return nCopies;
    }

    public void setnCopies(int nCopies) {
        this.nCopies = nCopies;
    }

    public int getnCopierAvailable() {
        return nCopierAvailable;
    }

    public void setnCopierAvailable(int nCopierAvailable) {
        this.nCopierAvailable = nCopierAvailable;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public int compareTo(Book o) {
        return Double.compare(this.getRating(), o.getRating());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
