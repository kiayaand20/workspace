public class ArrayExample {
    private static String [] familyNames = {"Kiaya", "Xavier", "Marlee", "Denise", "Strange"};

    public static void convertAndDisplayNamesToUpperCase(){
        for(int i = 0; i < familyNames.length; i++){
            String str = familyNames[i].toUpperCase();
            System.out.println(str);
        }
    }
//
//    public static int[] findOddNumbersFromArray(int[] numbers){
//        int[] findOddNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println("Odd Numbers: ");
//        for (int findOddNumber : findOddNumbers) {
//            if (findOddNumber % 2 != 0) {
//                return = findOddNumber;
//            }
//        }
//    }

    public static void main(String[] args) {
        convertAndDisplayNamesToUpperCase();
    }
}
