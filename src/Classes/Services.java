package Classes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Services {
    public static void menu() {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();
        List<Sections> sections = new ArrayList<>();
        String bookName, authorName, genre;
        while(loop) {
            /*System.out.println("Choose an option:\n");
            System.out.println("1)Reader\n");
            System.out.println("2)Admin\n");
            System.out.println("3)Exit\n");
            System.out.println("Your option: ");*/

            System.out.println("Choose an option:");
            System.out.println("1) Add a new book");
            System.out.println("2) See all books");
            System.out.println("3) See all authors");
            System.out.println("4) See all books in a section");
            System.out.println("5) See the books by an author");
            System.out.println("6) Exit");

            System.out.print("Your option: ");
            int optionChoice = sc.nextInt();
            System.out.print(optionChoice);


            switch (optionChoice) {
                case 1:
                    System.out.print("Book name:");
                    bookName = sc.nextLine();
                    System.out.print("Author name:");
                    authorName = sc.nextLine();
                    System.out.print("Genre:");
                    genre = sc.nextLine();

                    Book book = new Book(bookName, authorName, genre, 10, 10, 5);
                    books.add(book);

                    for (Author i : authors) {
                        if (i.getName().equals(authorName)) {
                            i.books.add(book);
                            break;
                        } else {
                            ArrayList<Book> bookToAdd = new ArrayList<>();
                            bookToAdd.add(book);
                            Author author = new Author(authorName, bookToAdd);
                            authors.add(author);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("All books:");
                    for(Book b : books) {
                        System.out.print(b.getTitle() + ", ");
                    }
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}
