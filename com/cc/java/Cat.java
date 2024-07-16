package com.cc.java;

public class Cat {
  
    private String name; 
    private String furColor;
    private int age;  
    
    // Konstruktor (keinen Rückgabetyp)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    






    
    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }
    

}
