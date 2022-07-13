package com.company;

public class Dancer extends Person{

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println("танцует");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "группа: " + groupName;
    }
}
