public class Iteration {
    public void displayNumbersUsingForLoop(int start, int end) {
        //for loop
        for (start = start; start < end; start++) {
            System.out.print(start);
        }
    }

    //while loop
    public void displayNumbersUsingWhile(int start, int end) {
        start = start;
        while (start < end) {
            System.out.print(start);
            start++;
        }
    }

    public void displayNumbersUsingDoWhile(int start, int end){
        start = start;
        do{
            System.out.print(start);
            start++;
        }
        while (start < end);
    }
}

class IterationClient {
    public static void main(String[] args) {
        Iteration practice = new Iteration();
        //for loop test
        practice.displayNumbersUsingForLoop(2, 7);
        //while loop test
        practice.displayNumbersUsingWhile(2, 7);
        //do-while loop
        practice.displayNumbersUsingDoWhile(2, 7);
    }
}