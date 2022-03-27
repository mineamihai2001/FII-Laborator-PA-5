package Commands;

import Biblio.Catalog;
import Biblio.Item;

import java.util.ArrayList;
import java.util.List;

public class AddCommand implements Command{
    private Catalog catalog;
    private Item i;

    public AddCommand(Item itemToAdd) {
        this.catalog = new Catalog();
        this.i = itemToAdd;
    }

    @Override
    public boolean genericCommand(Catalog catalog) {
        this.catalog = catalog;
        catalog.add(i);
        return true;
    }

    public Catalog getNewCatalog() {
        return (Catalog) catalog;
    }

}
