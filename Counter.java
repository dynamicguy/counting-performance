public class Counter {
    public static void count() {
        for (int i = 0; i < 10000000; i++) {
            System.out.print(i+",");
        }
    }

    public static void main(String[] args) {
        count();
    }
}

