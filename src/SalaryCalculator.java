import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base salary: ");
        double baseSalary = scanner.nextDouble();
        System.out.println("base salary: " + baseSalary);

        System.out.print("Enter allowance: ");
        double allowance = scanner.nextDouble();
        System.out.println("allowance: " + allowance);

        double grossSalary = baseSalary + allowance;

        double tax = 0.1 * grossSalary;
        System.out.println("tax: " + tax);
        double netSalary = grossSalary - tax;

        double finalSalary = (grossSalary > 50000) ? netSalary : grossSalary ;

        System.out.println("finalSalary :" + finalSalary);

        scanner.close();

    }
}
