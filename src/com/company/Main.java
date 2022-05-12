package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("PeakSoft", "Manas","Senior back-end developer");
        System.out.println(programmer);
        System.out.println(programmer.coding());
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println("\n-------------------------");

        Dancer dancer = new Dancer("Ak-Kuu","Ainura","Dance Teacher");
        System.out.println(dancer);
        System.out.println(dancer.dancing());
        dancer.learn();
        dancer.eat();
        dancer.walk();
        System.out.println("\n-------------------------");

        Singer singer = new Singer("Kyz-Burak","Saikal","Main in group");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.eat();
        singer.walk();
        System.out.println("-----------------------------");
    }
}
