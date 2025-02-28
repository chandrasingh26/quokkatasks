import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        byte b = 127;
        short s = 32767;

        System.out.print(b + " " + s);

        long a = 13546789456789L;
        System.out.println(a);

        float mySal = 1000.456756790f;
        double yourSal = 1200.567890;

        System.out.println(mySal);
        System.out.println(yourSal);

        char name = 'a';
        System.out.println((int) name);     //Type casting

        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        char heart = '\u2764';    // Uni code representation
        System.out.println(heart);
    }
}