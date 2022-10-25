import java.util.Arrays;

public class WordCountingUsingArrays {

    public static void main(String[] args) {
        String bostonSentence = "Hello I love Boston. Yes, you do Love Boston.";
        int wordCount = 0;
        String[] newArray = bostonSentence.split("[, ?.@]+");
//        System.out.println(Arrays.toString(newArray));

        for (int i = 0; i < newArray.length; i++) {
            wordCount = 1;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].equalsIgnoreCase(newArray[j])) {
                    wordCount++;
                    newArray[j] = "";
                }
            }
            if (newArray[i] != "")
                System.out.println(newArray[i] + " : " + wordCount);
        }
    }
}
