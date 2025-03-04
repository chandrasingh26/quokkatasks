//import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
    /*    int a = 5;
        System.out.println(Integer.toBinaryString(a));
        System.out.println('\n');

        int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);

        int d = 9;
        int f = d << 1;
        System.out.println(f);

        int e = d >> 1;
        System.out.println(e);
        System.out.println(Integer.toBinaryString(e));


        int a = 1;
        int b = 2;

        String c = "Sum";

        System.out.printf("%s of %d & %d : %d", c, a, b, a+b);

     */

        int[] arr1 = {2, 3, 6, 4, 2};

        sumOfArray(arr1);

        String st = "   abhINav    ";

        System.out.println(upperCase(st));
    }

        public static void sumOfArray(int[] arr) {
            int res = 0;
            for(int i : arr) {
                res += i;
            }
            System.out.println(res);
        }

        private static String upperCase(String str) {
            return str.trim().toUpperCase();
        }
}
