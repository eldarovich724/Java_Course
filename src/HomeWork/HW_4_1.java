package HomeWork;

import java.util.Arrays;

public class HW_4_1 {

    public static void main(String[] args) {

/*        System.out.println("4.1-1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0; //задается переменная где хранится сумма
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
            System.out.println(sum);
        System.out.println(array.length);

*/   //#1

        System.out.println("4.1-2,3");
//классический алгоритм поиска максимального значения:
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//начинаем с первого элемента массива. если начать с 0, то если в массиве есть отрицательные числа,
//то результат будет 0б потомучто 0 больше отриц.чисел.
//чтобы задача гарантированно сработала нужно использовать "int max = Integer.MIN_VALUE;". при данном случае мы
//точно будем знать что если массив не пустой то любое значение точно больше или равно. //
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

     //##2,3

/*        System.out.println("4.1-4");

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            sum4 = sum4 + array4[i];
//            System.out.println(1.0 * array4[i] / array4.length);
        }
        System.out.println("Sum of values = " + sum4);
        System.out.println("total # of values in array = " + array4.length);
        System.out.println("arithmetic mean = " + (1.0 * sum4 / array4.length));

*/      //#4

/*        System.out.println("4.1-5");

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) { //цикл обращается к элементу основного массива
            for (int j = 0; j < array[i].length; j++) { // цикл обращается к элементу внутреннего массива
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);

*/      //#5

/*        System.out.println("Task#4.1-6");

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max)
                    max = array[i][j];
            }
        }
        System.out.println(max);

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min)
                    min = array[i][j];
            }
        }
        System.out.println(min);

*/      //#6

/*        System.out.println("Task#4.1-7");

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int x = array[0][0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);

//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int count = 0; //начало отсчета эелементов
//        for (int i = 0; i < array.length; i++) { //считается кол-во элементов во внешнем массиве
//            for (int j = 0; j < array[i].length; j++) { //считается кол-во элементов во внутренних массивах
//                count = count + array[i][j]; //здесь идет обращение к каждому элементу внутреннего массива в каждом елементе внешнего массива
//                count = count + 1;
//                System.out.println(count);
//            }
//        }

//        int[] arr0 = {1, 2, 3, 4, 5};
//        int[][] arr = {{1, 2, 3}, {4, 5}};
//        int x = arr[0][0];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) ;
//            System.out.println(arr[i].length);
//            count = count++;
//
//            System.out.println(count);
//        }

*/      //#7
        }
    }
