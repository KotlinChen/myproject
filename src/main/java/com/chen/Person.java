package com.chen;

public class Person {
    float weight;
    float height;
    String name;
    public Person(float weight,float height){
        this.weight = weight;
        this.height = height;
    }
    public Person(String name,float weight,float height){
        this(weight, height);
        this.name = name;
    }
    public float bmi(){
        float bmi = weight / ( height * height );
        return bmi;
    }
    public void hello(){
        System.out.println("123");
    }

}
