public class operator {
    public static void main(String[] args) {
        int a = 5;
        float b = 7.3f;

        float c = a + b;
        System.out.println(c);

        long d = 4567898;
        long result = d * 4565678;

        System.out.println(result);

        float p = 10f;
        int q = 3;

        float r = p/q;
        System.out.println(r);

        int y = 10;
        int z = 2;

        int x = y * z + 2 / 5;      // In case if both multiply and divide is present
                                    // then left -> right associativity
        System.out.println(x);
    }
}
