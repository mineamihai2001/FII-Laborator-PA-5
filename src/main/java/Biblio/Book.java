package Biblio;

public class Book extends Item{

    Book(String title, String location, double year, String author, String type) {
        super(title, location, year, author, type);
    }
    void printData() {
        System.out.println(getTitle());
    }
}
