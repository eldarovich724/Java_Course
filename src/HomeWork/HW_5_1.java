package HomeWork;

import Methods.ArithmeticMethods;

public class HW_5_1 {

    static ArithmeticMethods aMet = new ArithmeticMethods();

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min)
                min = args[i];
        }
        return min;
    }

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + "sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));

//        int a = 6;
//        int b = 2;
//        aMet.sum(a, b);
//        System.out.println(aMet.sub(a, b));
//        aMet.mul(a, b);
//        aMet.div(a, b);
//
//        int i = 2;
//        System.out.println(aMet.doubleInteger(i));
//
//        System.out.println("CodeWars2:");
//        System.out.println(aMet.isLove( 3, 4));

//        System.out.println("CodeWars3:");
//        System.out.println(aMet.numberToString(67));

//        System.out.println("CodeWars4:");
//        int[] arr = {78, 56, 232, 12, 11, 43};
//        System.out.println(arr);




    }
}

