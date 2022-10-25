public class DogClient {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Blue Healer");
        Dog dog2 = new Dog("Yorkie", "Sasha", 8);
        Dog dog3 = new Dog();

        dog1.eat();
        dog2.eat();
        dog3.eat();
        dog1.barks();
        dog2.barks();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(Dog.getNumberOfTimesEatMethodIsInvoked());
    }
}

