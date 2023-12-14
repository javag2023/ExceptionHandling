package example;

public class Sample1 {

    public static void main(String[] args) {
        System.out.println(divide(4, 2));
        System.out.println(divide(3, 2));
        System.out.println(divide(3, 0));
    }

    private static int divide(int a, int b) {
        try {
            System.out.println(a + " is going to get divided by " + b);
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Exception was caught when " + a + " is going to get divided by " + b);
            exception.printStackTrace();
            return -1;
        }
    }
}
