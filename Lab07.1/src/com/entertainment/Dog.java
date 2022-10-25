package com.entertainment;

public class Dog {
    //  FIELDS or INSTANCE VARIABLES
    private String breed = "Pug";
    private String name = "Fido";
    private int size = 15;
    public static int numberOfTimesEatMethodIsInvoked = 0;

    //  CONSTRUCTORS
    public Dog(){
    }

    public Dog(String breed){
        setBreed(breed);
    }

    public Dog(String breed, String name, int size){
        this(breed);
        setName(name);
        setSize(size);
    }

    //  BUSINESS METHODS
    public void eat(){
        numberOfTimesEatMethodIsInvoked++;
        System.out.println(name + " is eating.");
    }
    public void barks() {
        System.out.println(breed + " barks a lot.");
    }

    //  ACCESSOR METHODS
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getNumberOfTimesEatMethodIsInvoked() {
        return numberOfTimesEatMethodIsInvoked;
    }

    //toString Method
    @Override
    public String toString() {
        return "com.entertainment.Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

