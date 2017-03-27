package org.launchcode.models;

import java.util.ArrayList;

/**
 * Created by modus on 3/21/17.
 */
public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    // add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    // remove
    public static void remove(int id) {
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }

    // update
    public static void update(int id, String name, String description) {
        Cheese cheeseToUpdate = getById(id);
        // cheeses.
    }

    // getById
    public static Cheese getById(int id) {
        Cheese theCheese = null;
        for (Cheese candidateCheese : cheeses) {
            if (candidateCheese.getCheeseId() == id) {
                theCheese = candidateCheese;
            }
        }
        return theCheese;
    }

}
