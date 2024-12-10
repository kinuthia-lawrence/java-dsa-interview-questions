package com.larrykin.classwork.practice;

public class Bird extends ClassWork.Animal {
   private int Wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        Wings = wings;
    }


    @Override   //means changing the behavior of a method from what is happening in the parent class
    public void eat(String food) {
        super.eat(food);  // These are the behaviors of  the parent class, if you want to override completely you can delete them.
        System.out.println("Swallowing "+ food);
    }

    public void fly(){
        System.out.println(this.getName() + " is flying");
    }

    public void fly(String name, int wings){
        System.out.println(this.getName() + " is flying");
    }
// Instances of polymorphism
    public void fly(String name){
        System.out.println(this.getName() + " is flying");
    }
    public int getWings() {
        return Wings;
    }

    public void setWings(int wings) {
        Wings = wings;
    }


}
