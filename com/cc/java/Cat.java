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

// Getter
    public String getName() {
        if (getPermission()) {
            return name;
        } else {
            return "sorry, no Permission";
        }
        
    }

// Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }



    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }



    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }
    
    private boolean getPermission(){
        return true;
        // return false;
    }

}
