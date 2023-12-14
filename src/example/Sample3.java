package example;

public class Sample3 {

    public static void main(String[] args) {

        System.out.println(calculateDivisionStr("12", new int[]{4, 34, 37}, "0"));
        System.out.println(calculateDivisionStr("124ZZ", new int[]{444, 34, 37}, "0"));
        System.out.println(calculateDivisionStr("212", new int[]{444, 2, 37}, "1"));
        System.out.println(calculateDivisionStr("12", new int[]{444, 34, 37}, "10"));

    }

    private static int calculateDivisionStr(String bigNumber,
                                            int[] array,
                                            String index) {
        int bigNumberInt = Integer.parseInt(bigNumber);
        int indexInt = Integer.parseInt(index);
        return calculateDivision(bigNumberInt, array, indexInt);
    }

    private static int calculateDivision(int bigNumber, int[] array, int index) {
        return bigNumber / readTheArrayItem(array, index);
    }

    private static int readTheArrayItem(int[] array, int index) {
        return array[index];
    }
}