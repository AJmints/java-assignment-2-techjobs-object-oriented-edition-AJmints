package org.launchcode.techjobs.oo;

public abstract class JobField {
    private int id;
    private static int nextId = 1;

    public JobField() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

}
