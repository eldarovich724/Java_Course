package Methods;

public class ArithmeticMethods {

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }

    public static void div(int a, int b) {
        double div = (double)a / b;
        System.out.println(div);
    }

    public static int doubleInteger(int i) {
//        int doubleInteger = i * 2;
//        return doubleInteger;
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0);
    }

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min)
                min = args[i];
        }
        return min;
    }




}
