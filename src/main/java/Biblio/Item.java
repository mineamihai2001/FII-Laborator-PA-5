package Biblio;

import java.util.UUID;

public abstract class Item {
    private String id;
    private String title;
    private String location;
    private double year;
    private String author;
    private String type;

    Item() {
        id = "";
        title = "";
        location = "";
        year = 0;
        author = "";
        type = "";
    }
    Item (String title, String location, double year, String author, String type) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this. title = title;
        this.location = location;
        this .year = year;
        this .author = author;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
}
