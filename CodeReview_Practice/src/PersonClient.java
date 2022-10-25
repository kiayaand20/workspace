public class PersonClient {
    public static void main(String[] args) {
        Person person = new Person("Kiaya", 33);
        String personInfo = person.getPersonInfo();
        System.out.println(personInfo);

        Person person1 = new Person();
        person1.setName("Cindy");
        person1.setAge(33);
        String personInfo1 = person1.getPersonInfo();
        System.out.println(personInfo1);

    }
}

