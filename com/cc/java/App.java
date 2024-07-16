package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Custom-Konstruktor
        Cat cat = new Cat("Grizabella", "white", 29);
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());

        // Werte ausgeben
        output(cat.getName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge())); 

        System.out.println("----------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());


        // Werte ausgeben
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge())); 

        cat2.setAge(16);
        output(Integer.toString(cat2.getAge()));
    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   
}

