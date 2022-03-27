package Commands;
import Biblio.Catalog;
import Biblio.Item;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class ToStringCommand implements Command{
    private Catalog catalog;

    ToStringCommand() {
        this.catalog = new Catalog();
    }

    @Override
    public boolean genericCommand(Catalog catalog) {
        this.catalog = catalog;
        File file = new File("./src/main/java/Biblio/text.txt");

        System.out.println(catalog);
        return true;
    }
}
