class ComputerClient {
    public static void main(String[] args) {
        ComputerUsingOverloadMethods computer = new ComputerUsingOverloadMethods();
        int addValue = computer.add(11, 12);
        int subtractValue = computer.subtract(252, 101);
        long addValue1 = computer.add(200L, 500L);
        long subtractValue2 = computer.subtract(500L, 200L);

        System.out.println("The addition value is " + addValue + " and the subtraction value is " + subtractValue);
        System.out.println("The long addition value is " + addValue1 + " and the long subtraction value is " + subtractValue2);
    }
}
