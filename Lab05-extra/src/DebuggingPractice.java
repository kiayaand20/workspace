public class DebuggingPractice {
    private int x = 5;
    private static String name = "kiaya";

    public static int testMethod(int argument){

        var counter = 0;

        for (int i = 0; i < 0; i++){
            System.out.println(i);
            name = name.toUpperCase();
            counter++;
        }
        int result = counter;
        return result;
    }

    public static void main(String[] args) {
        int y = testMethod(5);
        System.out.println(y);
    }
}

