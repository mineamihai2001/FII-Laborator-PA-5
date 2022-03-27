package Commands;

import Biblio.Catalog;
import Biblio.Item;

import java.io.IOException;
import java.util.List;

public interface Command {
    public boolean genericCommand(Catalog catalog) throws IOException;
}
