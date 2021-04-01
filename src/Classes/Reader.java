package Classes;

import java.util.ArrayList;

public class Reader extends Person {
    private String email;
    private String address;
    private ArrayList <Book> rentedBooks;

    public Reader(String firstName, String lastName, String email, String address, ArrayList<Book> rentedBooks) {
        super(firstName, lastName);
        this.email = email;
        this.address = address;
        this.rentedBooks = rentedBooks;
    }

    public String getNumePersoana () { return super.getNumePersoana(); }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(ArrayList<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
}
