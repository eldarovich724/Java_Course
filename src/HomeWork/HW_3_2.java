package HomeWork;

public class HW_3_2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 15; i = i + 1) {
            System.out.println(i);
        }

        {
            for (double i2 = 5; i2 < 10000; i2 = i2 * 5) {
                System.out.println(i2);
            }
        }

        {
            for (int i3 = 40; i3 <= 60; i3++) {
                if ((i3 % 4) == 0) {
                    System.out.println(i3);
                }
            }
        }

        {
            for (int i4 = 40; i4 <= 60; i4 = i4 + 4) {
                System.out.println(i4);
            }
        }
    }
}
