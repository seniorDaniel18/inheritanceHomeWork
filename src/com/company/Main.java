package com.company;

public class Main {
    public static void main(String[] args) {

        Programmer pro = new Programmer("Даниель", "программист", "Daniel Inc");

        System.out.println(pro);
        pro.coding();
        pro.learn();
        pro.walk();
        pro.eat();
        System.out.println("----------------------------------");

        Dancer dan = new Dancer("Лукерия", "танцор", "T-Fest");

        System.out.println(dan);
        dan.dancing();
        dan.learn();
        dan.walk();
        dan.eat();
        System.out.println("----------------------------------");

        Signer sig = new Signer("Джимми", "певец", "The Hatters");
        System.out.println(sig);
        sig.singing();
        sig.learn();
        sig.walk();
        sig.eat();
        sig.playsTheGuitar();

    }
}




