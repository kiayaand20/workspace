public class Main {
    private static int myIntField;
    private static String myStringField;

    public static void main(String[] args) {
        myMethod();
    }

    private static void myMethod(){
//        Can you use public or private to local variables
        int myLocalInt = 3;
        String myLocalString = "Kiaya";

        System.out.println(myLocalInt + " " + myLocalString);
        System.out.println(myIntField + " " + myStringField);
    }
}
