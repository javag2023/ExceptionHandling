package example;

public class Sample2 {

    public static void main(String[] args) {
        try {
            readTheArrayItem(new int[]{444, 34, 37}, 0);
            readTheArrayItem(new int[]{1, 34, 37}, 1);
            readTheArrayItem(new int[]{11, 43, 35}, 2);
            readTheArrayItem(new int[]{13, 123, 33}, 5);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMyOwnMessage());
        }
    }

    private static void readTheArrayItem(int[] array, int index) throws MyException {
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            throw new MyException("I tried to read the wrong index",
                    exception.getMessage(),
                    exception);
        }
    }
}