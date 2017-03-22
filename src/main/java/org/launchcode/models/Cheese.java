package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public class Cheese {

    private String name;
    private String description;

    private int cheeseId;
    private static int nextId = 1;

    public Cheese() {
        this.cheeseId = nextId;
        nextId++;
    }

    public Cheese(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCheeseId() {
        return cheeseId;
    }
}
