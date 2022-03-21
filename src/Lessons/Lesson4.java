package Lessons;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i = i + 1;
//        }
//
//        System.out.println(str);
//
//        int i2 = 0;
//        do {
//            System.out.println(i2);
//            i2 = i2 + 1;
//        } while (i2 < 5);


//        int[] arr = {2, 4, 6, 8, 10, 12};

//        for (int i = 0; i < arr.length; i = i + 1) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr.length); //распечатывает длину массива
//        arr[1] = 120;
//        int a = arr[1];
//        System.out.println(a);

/*      reference types:

        int[] arr = {2, 4};
        arr[0] = 10; //так можно переприсвоить значение в массиве
        System.out.println(Arrays.toString(arr));

        int[] a = {2,4};
        int[] b = a;
        b[0] = 20;
        System.out.println(Arrays.toString(a));

        a[1] = 40;
        System.out.println(Arrays.toString(b));
// две переменные ссылаются на один массив. переприсваивается не переменная а ссылка переменной на массив.
*/

/*    при работе со стрингами при переприсваивании стрингс создается как бы копия.
строка всегда остается не изменной.

        String str1 = "Привет!";
        String str2 = str1;
        sout(str2);

 */
        //Functions
//        Math.pow(x,y) -> z=x в степени y

//        str.replace(str, 'oldChars', 'newChars')
//        String str33 = "Hello!";
//        Replace(str33, "e", "*"); //-----???

/*        substring(с какого, до какого) //-----???
        String str11 = "Привет!";
        String result = str11.substring(1, 4);
        System.out.println(result);

 */

/*        String str = "Привет!";
        for (int i = 0; i < str.length(); i = i + 1) {
            System.out.print(str.charAt(i));
            System.out.print(str.charAt(i) + " ");
        }
        можно добавлять иф как условие
 */

/*        //Сравнивание массивов
//        пересмотреть equals.
        int[] aa = {2, 4};
        int[] bb = {2, 4};
//        System.out.println(a == b);
        System.out.println(Arrays.equals(aa, bb));
//        System.out.println(a == b);

//        String aa = "Hi!";
//        String bb = "Hi!";
//        System.out.println(aa == bb);

 */

        //одномерный и многомерный массивы

//        int[] a = {8, 2, 3, 5};

        int[][] b = {{1, 2}, {3, 4, 5}}; //многомерный (двумерный) массив


//        for (int i = 0; i < a.length; i = i + 1) {
//            System.out.println(a[i]);

            for (int i2 = 0; i2 < b.length; i2 = i2 + 1) {
                for (int j = 0; j < b[i2].length; j = j + 1) {
                    System.out.println(b[i2][j]);
                }
            }
        }
    }
//}






//        for HW:
//        indexOf()









