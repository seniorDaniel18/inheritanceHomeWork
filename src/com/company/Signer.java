package com.company;

public class Signer extends Person{

    public Signer(String name, String designation) {
        super(name, designation);
    }

    private String bandName;

    public Signer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println("поёт");
    }

    public void playsTheGuitar(){
        System.out.println("играет на гитаре");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "группа: " + bandName;
}
    }

