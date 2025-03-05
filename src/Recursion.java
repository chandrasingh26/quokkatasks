public class Recursion {

        public static void main(String args[]) {
            long nFactoriral = factorialProgram(9);
            System.out.println(nFactoriral);
        }

        public static long factorialProgram(long n) {
            if (n <= 1) {
                return 1;
            } else {
                return n * factorialProgram(n - 1);
            }
        }

}
