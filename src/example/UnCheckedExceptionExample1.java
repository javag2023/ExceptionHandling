package example;

public class UnCheckedExceptionExample1 {

    public static void main(String[] args) {
        System.out.println(calculateDivision(4, 2));
        System.out.println(calculateDivision(5, 2));
        System.out.println(calculateDivision(6, 3));
        System.out.println(calculateDivision(6, 0));
    }

    /**
     * the method doesn't handle exception and the compiler is not giving errors neither
     * @param a
     * @param b
     * @return
     */
    private static double calculateDivision(int a, int b) {
        //return ((double) a) /  b;//this will give 'Infinity' if divided by 0
        return a / b;
    }
}
