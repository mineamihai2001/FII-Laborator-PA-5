package Commands;

import Biblio.Catalog;
import Biblio.Item;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewCommand implements Command{
    private Catalog catalog;

    ViewCommand() {
        this.catalog = new Catalog();
    }

    @Override
    public boolean genericCommand(Catalog catalog) throws IOException {
        this.catalog = catalog;
        File f = new File("./src/main/java/Biblio/test.json");
        if(Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            desktop.open(f);
        }
        return true;
    }
}
