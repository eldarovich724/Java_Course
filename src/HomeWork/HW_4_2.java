package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class HW_4_2 {

    public static void main(String[] args) {

//        System.out.println("Task#4.2-1");

//        String s = "Перестановочный алгоритм быстрого действия";
//
//        for (int i = 0; i < s.length(); i++) {    //проходим по каждому элементу строки
//            if (s.charAt(i) == 'о') {//проверяем на соответствие условию. s.charAt(i) означает отдельный символ
//                System.out.print(s.charAt(i));    //вывод в консоль если условие верно. вместо s.charAt(i) можно ввести 'о'.
//            }
//        }

//        System.out.println("Task#4.2-2");

//        String s2 = "Перевыборы выбранного президента";
//        int countE = 0;                             //начало отсчета с 0
//        for (int i = 0; i < s2.length(); i++) {     //проходим по каждому элементу строки
//            if (s2.charAt(i) == 'е') {              //проверяем на соответствие условию. s.charAt(i) означает отдельный символ
//                countE = countE + 1;                //если условие верно то увеличиваем на 1 счетчик
//            countE++;
//            }
//        }
//        System.out.println(countE);

        System.out.println("Task#4.2-3");

        String s3 = "Посмотрите как Рите нравится ритм";
        s3 = s3.toLowerCase();                                      //переводит всю строку в lower case
        int index = s3.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s3.indexOf("рит", index +1);        //этот индекс начинает поиск со следующего элемента после найденного
        }


        System.out.println("Task#4.2-3");

        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
    int count = 0;                                          //счетчик. если нужно чтото посчитать то всегда есть выражение: чтото = 0.
        for (int i = 0; i < array.length; i++) {            //идем циклом по двумерному массиву
            for (int j = 0; j < array[i].length; j++) {     //идем циклом по двумерному массиву
                if (!array[i][j].contains("е")) {           //создаем условие: ищем элемент который содержит заданное значение.
                                                            //отрицание стоит потому что нужно исключить те елементы в которых есть "е".
                    count = count + 1;                      //этой строкой считаются элементы по условию.
                }
            }
        }
        System.out.println(count);
    }
}





