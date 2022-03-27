package Commands;

import Biblio.Catalog;
import Biblio.Item;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveCommand implements Command{
    private Catalog catalog;

    public SaveCommand(Catalog catalog) {
        this.catalog = new Catalog();
    }

    @Override
    public boolean genericCommand(Catalog catalog) throws IOException {
        this.catalog = catalog;
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("./src/main/java/Biblio/test.json");
        try{
            objectMapper.writeValue(file, catalog);
        }catch (Exception e) {
            throw e;
        }
        return true;
    }
}
