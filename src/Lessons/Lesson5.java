package Lessons;

public class Lesson5 {

    public static void main(String[] args) {

        /*
//        a++, a-- -> унарные операции, инкремент и декримент
//        ++a, --a -> прединкремент

//        a += 5; <=> a = a + 5; (-+, *=, /=)

//        for (int i = 0; i < 5; i++) {
//
//            if (i == 3) {
//                break; //останавливает и вываливает в конец программы только цикл
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 5; i++) {
//
//            if (i == 3) {
//                continue;   //прерывает итерацию не продолжая цикл и возвращает на начало цикла и
//                            // только после выполнения этой возвратной итерации заверщает и закрывает цикл.
//            }
//            System.out.println(i);
//        }
*/

//        Методы:

        Test t = new Test();
//        WorkMethods wm = new WorkMethods();

        int a = 34;
        int b = 54;

        t.sum2(a, b);

        System.out.println("-------------------");

        int x = 11;
        int y = 3;
        int z = 55;

        int xyz = t.sum3(x, y, z);
        System.out.println(xyz);

        System.out.println("-------------------");

        int a2 = 78;
        int b2 = 867;
        int c2 = 46;
        int d2 = 5;
        int e2 = 2;

        WorkMethods.sum5(a2, b2, c2, d2, e2);
//        int r1 = t.sum(a, b);
//        System.out.println(r1);

        System.out.println("-------------------");

//      создание метода:
//        public static void sum(int a, int b) {        //sum имя метода, может каким угодно. в скобках указываем параметры (тип и имя) метода
                                                        //аргумент это то что выполняется в этом методе дальше в коде.
//            int c = a + b;                            //реализация метода.
//            System.out.println(c);
//        }


//        String str = "Hi!";
//        System.out.println(str.indexOf("!")); //возвращает номер искомой позиции




    }
}
