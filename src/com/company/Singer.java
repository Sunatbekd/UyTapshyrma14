package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String bandName,String name,String designation) {
        this(name,designation);
        this.bandName = bandName;
    }

    public Singer(String name,String designation){
        super(name,designation);
    }

    public void singing(){
        System.out.println("I like singing");
    }
    public void playGitar(){
        System.out.println("I like singing with gitara");
    }

    @Override
    public void learn() {
        System.out.println("Я научился петь у брата");
    }

    @Override
    public void walk() {
        System.out.println("Я люблю гулять по набержной");
    }

    @Override
    public void eat() {
        System.out.println("Я люблю кушать плов");
    }

    @Override
    public String toString(){
        return "This is class Singer\nMy name is: "+getName()+"\nBand name: "+bandName+"\nDesignation: "+getDesignation();
    }
}
