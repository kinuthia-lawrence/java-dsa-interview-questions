package com.larrykin.classwork.practice;

public class Organ {
    private String name;
    private  String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }


    public void getDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.medicalCondition);
    };




    public String getName() {
        return name;
    }


    public String getMedicalCondition() {
        return medicalCondition;
    }


}
