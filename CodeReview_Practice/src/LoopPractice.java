public class LoopPractice {
    public static void main(String[] args) {
        int index = 0;
        while(index < 5) {
            System.out.println("index = " + index);
            index++;
        }

        for(int index2 = 5; index2 > 0; index2--){
            System.out.println("index2 =" + index2);
        }

        for(int index3 = 0; index3 <= 5; index3++){
            System.out.println("index3 = " + index3);
        }

        String[] names = {"kiaya", "sang", "cindy"};
        for(String name:names){
            System.out.println("My name is " + name);
        }

        // Conversion to and from String - parse.Int
        Integer sevenInteger = Integer.valueOf("7");
        String sevenString = sevenInteger.toString();
        System.out.println(sevenString);
    }
}
