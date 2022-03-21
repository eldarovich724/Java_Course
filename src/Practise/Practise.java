package Practise;

public class Practise {
    public static void main(String [] args) {
//        String i = "test";
//        String j = "TEST";
//        if (i != j)
//                System.out.println("true");
//                        else System.out.println("false");
//            if (i == j)
//                System.out.println("true");
//            else System.out.println("false");
//int a = 25;
//int b = 78;
//int c = 87;
        int a = 25, b = 78, c = 87, d = 100, f = 75, g = 101, z;
        if (a >= b)
        {
            if (a >= c) { z = a; }
            else { z = c; }
            if (a >= d) { z = a; }
            else { z = d; }
        }
        else
        {
            if (a >= c) {z = a;}
            else {z = d;}
            if (b >= c) { z = b; }
            else { z = c; }
            if ( b >= d) { z = b; }
            else { z = d; }
            if (c >= d) {z = c;}
            else {z = d;}
            if (c >= f) {z = c;}
            else {z = f;}
            if (d >= f) {z =d;}
            else {z = f;}
            if (f >= g) {z = f;}
            else {z = g;}
        }
        System.out.println(z);
    }
    }
