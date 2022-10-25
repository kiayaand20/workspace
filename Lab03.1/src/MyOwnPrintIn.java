class PrintStream {
    public void println(String x) {
        System.out.println(x);
    }

    public void println(int x) {
        System.out.println(x);
    }

    public void println(double x) {
        System.out.println(x);
    }
}

class PrintStreamClient {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(5);
        System.out.println(2.99);
    }
}