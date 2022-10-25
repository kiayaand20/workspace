import java.util.EnumSet;

public class MyFamilyClass {
    public static void main(String[] args) {
        for (MyFamily family : MyFamily.values()) {
            System.out.println(family);
        }

        for (MyFamily family : EnumSet.range(MyFamily.KIAYA, MyFamily.MARLEE)) {
            System.out.println(family);
        }
    }
}
