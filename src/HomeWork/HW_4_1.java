package HomeWork;

import java.util.Arrays;

public class HW_4_1 {

    public static void main(String[] args) {
        String line = "-----------------------------------------------------";

        System.out.println("4.1-1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
            System.out.println(sum);

   //#1

/*        System.out.println("4.1-2,3");

        int[] arr = {9, 2, 6, 4, 5, -12, 7, 8, 6};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        } System.out.println("max value = " + max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        } System.out.println("min value = " + min);

 */     //##2,3

/*
        System.out.println(line);
        System.out.println("4.1-4");

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            sum4 = sum4 + array4[i];
//            System.out.println(1.0 * array4[i] / array4.length);
        }
        System.out.println("Sum of values = " + sum4);
        System.out.println("total # of values in array = " + array4.length);
        System.out.println("arithmetic mean = " + (sum4 / array4.length));

 */     //#4

//        System.out.println(line);
//        System.out.println("4.1-5");
//
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
////        System.out.println(Arrays.deepToString(array));
////        System.out.println(array.length);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
////                for (int k = 0; j < array[j].length; k++) {
////                    for (int l = 0; l < array[l].length; l++) {
//                        System.out.println(array[i][j]);
//                    }
//                }


//            }
//        }






        }
    }
