package com.abstractexamples;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void breathe();

    public String getName() {
        return name;
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println( getName() + " breathe by Cat");
    }

}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Dog");
    }

}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Bird");
    }
}

class AnimalHospital {

    Animal[] animals;//array of animals
    int numberOfValidAnimals;//counter

    //constructor
    public AnimalHospital(Animal[] animals, int numberOfValidAnimals) {
        this.animals = animals;
        this.numberOfValidAnimals = numberOfValidAnimals;
    }

    public void letAllAnimalsBreathe() { //method
        for (int i = 0; i < numberOfValidAnimals; i++) {
            animals[i].breathe();
        }
    }

    public void addAnimal(Animal animal){
        animals[numberOfValidAnimals++] = animal;
    }
}

class AnimalHospitalClient {

    private static Animal[] animals = new Animal[100];
    private static int currrentIndex = 0;

    public static void main(String[] args) {
        Cat cat1 = new Cat("jon");
        animals[currrentIndex++] = cat1;
        Cat cat2 = new Cat("mary");
        animals[currrentIndex++] = cat2;
        Dog dog1 = new Dog("chally");
        animals[currrentIndex++] = dog1;
        Bird paul = new Bird("paul");
        animals[currrentIndex++] = paul;
        Bird bird1 = new Bird("sally");
        AnimalHospital animalHospital = new AnimalHospital(animals, currrentIndex);
        animalHospital.addAnimal(bird1);
        animalHospital.letAllAnimalsBreathe();

    }
}