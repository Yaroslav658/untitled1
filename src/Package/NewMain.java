package Package;

public class NewMain {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double res = i2 / d1 + d2 % i1 - l;
        System.out.println(res);
        System.out.println();


        int a = 5;
        int a1 = a-- - --a + ++a + a++ + a;
        // int a1 = 5 - 3 + 4 + 4 + 5;
        int b = 8;
        int b1 = ++b - b++ + ++b - --b;
        //  int b1 = 9 - 9 + 11 - 10;
        System.out.println(a1);
        System.out.println();
        System.out.println(b1);
    }
}
