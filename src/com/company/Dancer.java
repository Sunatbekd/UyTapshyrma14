package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String groupName, String name,String designation) {
        this(name,designation);
        this.groupName = groupName;
    }

    public Dancer(String name,String designation){
        super(name, designation);
    }

    public String dancing(){
        return "I love to dance";
    }

    @Override
    public void learn() {
        System.out.println("Я учился на танцы на курсах");
    }

    @Override
    public void walk() {
        System.out.println("Я люблю ходить по улице");
    }

    @Override
    public void eat() {
        System.out.println("Я люблю кушать гамбургер");
    }

    @Override
    public String toString(){
        return "This is class Dancer\n My name is: "+getName()+"\nGroup name: "+groupName+"\nMy designation: "+getDesignation();
    }
}
