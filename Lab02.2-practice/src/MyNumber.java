class MyNumber {

    public static int computeRandomInt(int start, int end) {
        int differenceBetweenStartAndEnd = end - start;
        return ((int)(Math.random() * differenceBetweenStartAndEnd)) + start;
    }
}

 class Main {
     public static void main(String[] args) {
         int test = MyNumber.computeRandomInt(1, 10);
         System.out.println(test);
     }
 }