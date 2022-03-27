package Biblio;

import Commands.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Catalog catalog = new Catalog();
        Book b1 = new Book("The Art of Computer Programming", "d:/books/programming/tacp.ps", 1967, "Donald E. Knuth", "book");
        Book b2 = new Book("The Art of Computer Programming_@", "d:/books/programming/tacp.ps", 1969, "Donald E. Knuth2222", "book");
        catalog.add(b1);
        catalog.add(b2);
//        catalog.save();
//        catalog.load();
//        catalog.toString();

        AddCommand a = new AddCommand(b1);
        a.genericCommand(catalog);
        catalog = a.getNewCatalog();

        SaveCommand s = new SaveCommand(catalog);
        catalog.load();
    }
}
