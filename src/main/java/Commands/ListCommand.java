package Commands;

import Biblio.Catalog;
import Biblio.Item;

import java.util.ArrayList;
import java.util.List;

public class ListCommand implements Command{
    private Catalog catalog;

    ListCommand() {
        this.catalog = new Catalog();
    }

    @Override
    public boolean genericCommand(Catalog catalog) {
        this.catalog = catalog;
        System.out.println(catalog);
        return true;
    }
}
