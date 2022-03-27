package Commands;

import Biblio.Catalog;
import Biblio.Item;

import java.util.List;

public class ReportCommand implements Command{
    @Override
    public boolean genericCommand(Catalog catalog) {
        return true;
    }
}
