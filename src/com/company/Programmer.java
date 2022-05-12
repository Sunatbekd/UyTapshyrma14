package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String companyName,String name, String designation) {
        this(name,designation);
        this.companyName = companyName;
    }

    public String coding(){

        return "I can write code";
    }

    public Programmer(String name, String designation){
        super(name,designation);

    }

    @Override
    public void learn() {
        System.out.println("Программист учился на Политехе");
    }

    @Override
    public void walk() {
        System.out.println("Я люблю гулять по парку");
    }

    @Override
    public void eat() {
        System.out.println("Я люблю кушать мясо");
    }

    @Override
    public String toString() {
        return "This is Programmer class: \n " +
                "My name is: " + getName() + "\n" +
                "Company name: " + companyName+ "\n" +
                "My designation: " + getDesignation();
    }
}
