public class Person {

    //fields
    String name;
    int age;

    //constructors
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name; //this is used to assign arguments to field
        this.age = age;
    }

    // business models
    public String getPersonInfo(){
        return name + " " + age;
    }

    // accessor methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
