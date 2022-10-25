class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television("Samsung", 32);
//      tv1.turnOn();
//      tv1.turnOff();
//      tv1.verifyInternetConnection();
//      tv1.setVolume(Television.MAX_VOLUME);
        System.out.println(tv1);

        Television tv2 = new Television("Sony");
//      tv2.setBrand("Visio");
//      tv2.turnOn();
//        System.out.println(Television.getInstanceCount() + " instances");

        System.out.println(tv2);

        Television tv3 = new Television();
//      tv3.setVolume(Television.MIN_VOLUME);

        Television tv4 = new Television("Samsung", 45);
        tv4.setDisplay(DisplayType.OLED);
        System.out.println(tv4);
        System.out.println(tv1);

    }
}
