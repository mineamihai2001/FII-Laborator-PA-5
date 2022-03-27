package Biblio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import Commands.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Catalog {
    private List<Item> catalog;

    public Catalog() {
        this.catalog = new ArrayList<>();
    }

    public void add(Item i) {
        catalog.add(i);
    }

    @Override
    public String toString() {
        String s = new String("null");
        for (Item i : catalog) {
            System.out.println("id: " + i.getId() + "; title: " + i.getTitle() + "; location: " + i.getLocation() + "; year: " + i.getYear() + "; author: " + i.getAuthor() + "; type: " + i.getType());
        }
        return s;
    }

    public void save() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("./src/main/java/Biblio/test.json");
        objectMapper.writeValue(file, catalog);
    }

    public void load() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("./src/main/java/Biblio/test.json");
        catalog = objectMapper.readValue(file, List.class);
        System.out.println(catalog);
    }

    /* Homework */

}
