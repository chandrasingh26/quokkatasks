public class Conditional {
    public static void main(String[] args) {

        int age = 50;
        int marks = 35;

        if(age <=20 && marks >=33) {
            System.out.println("Congrats!");
        }
        else {
            System.out.println("Better luck next time");
        }


        for(int i=0; i<6; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
