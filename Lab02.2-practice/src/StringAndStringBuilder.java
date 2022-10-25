public class StringAndStringBuilder {

    public static String constructMyAddressUsingString() {
        return new String("10925 " + "Moss Park Road ");
    }

    public static String constructMyAddressUsingStringBuilder() {
        return new StringBuilder(32)
                .append("10925")
                .append(" ")
                .append("Moss Park Road").toString();
    }

    public static String constructMyAddressUsingStringConcat() {
        String s1 = "10925 ";
        String s2 = "Moss Park Road";
        return s1.concat(s2);
    }

    public static void main(String[] args) {
        String construct1 = constructMyAddressUsingString();
        String construct12 = constructMyAddressUsingStringBuilder();
        String construct3 = constructMyAddressUsingStringConcat();

        boolean compareStrings = (construct1 == construct12); //false
        System.out.println(compareStrings);

        boolean compareStrings2 = construct1.equals(construct12); //false
        System.out.println(compareStrings2);

        boolean compareStrings3 = construct12.equals(construct3);// true
        System.out.println(compareStrings3);

        System.out.println(construct1);
        System.out.println(construct12);
        System.out.println(construct3);
    }
}

