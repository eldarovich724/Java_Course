package Lessons;

public class Lesson6 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};       //<-(правильное) создание массива
        int[] arr2 = new int[10];           //здесь создается массив из десяти элементов
        Person6[] arr3 = new Person6[10];   //создание массива из класса Person
        int[] arr4 = new int[0];             //<-пустой массив

        Person6 person1 = new Person6("Anna", 30);
//        Person6 person1 - new Person6("Anna");
//        person1.name = "Anna";
//        person1.age = 30;

        Person6 person2 = new Person6("Sergey");
        person2.name = "Sergey";
        person2.age = 35;

        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println();

//        person1.printObject();
        person2.printObject();

//что такое класс
//что такое поле класса
//что такое метод класса



    }
}
