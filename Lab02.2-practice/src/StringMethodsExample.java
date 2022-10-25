import java.util.Locale;

public class StringMethodsExample {

    public static void main(String[] args) {
        //exercise contains(..) method
        String testString = "Hello World";
        boolean contains = testString.contains("wor");
        System.out.println(contains);
        boolean elz = testString.contains("elz");
        System.out.println(elz);

        //exercise endsWith(..) method
        boolean endsWith = testString.endsWith("ld");
        System.out.println(endsWith);
        boolean testWith = testString.endsWith("er");
        System.out.println(testWith);

        //exercise equals(..) method
        String testString2 = "goodbye world";
        boolean equals = testString.equals(testString2);
        System.out.println(equals);

        //exercise equalsIgnoreCase method
        String testString3 = "hello world";
        boolean equalsIgnore = testString.equalsIgnoreCase(testString2);
        System.out.println(equalsIgnore);
        boolean equalsIgnore2 = testString.equals(testString3);
        System.out.println(equalsIgnore2);

        //exercise indexOf(..) method
        int index = testString.indexOf("e");
        System.out.println(index);

        //exercise length method
        int length = testString.length();
        System.out.println(length);

        //exercise split(String regex) method
        String[] splitTest = testString.split("o");
        for (String s : splitTest){
            System.out.println(s);
        }

        //exercise startsWith(String prefix) method
        boolean startTest = testString.startsWith("W");
        System.out.println(startTest);

        //exercise strip() method
        String stripMethodTest = testString.strip();
        System.out.println(stripMethodTest);

        //exercise substring(int beginIndex) method
        String substring = testString.substring(4, 8);
        System.out.println(substring);

        //exercise toLowerCase() method
        System.out.println(testString.toLowerCase());

        //exercise toUpperCase method
        System.out.println(testString.toUpperCase());
    }
}
