package com.company;

public class Programmer extends Person{

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println("пишет код");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "компания: " + companyName;
    }
}
