public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv4 = new Television("Vizio", 1);
        Television tv5 = new Television("Toshiba", 50);

        System.out.println(tv4.getVolume());
        System.out.println(tv4.getBrand());
        System.out.println(tv5.getBrand());

        tv4.setVolume(5);
        System.out.println(tv4.toggleMute());
        tv4.getVolume();
        System.out.println(tv4.toggleMute());
    }
}
