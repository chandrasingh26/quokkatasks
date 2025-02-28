import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base salary: ");
        double baseSalary = scanner.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = scanner.nextDouble();

        double grossSalary = baseSalary + allowance;

        double tax = 0.1 * grossSalary;
        double netSalary = grossSalary - tax;

        double finalSalary = (grossSalary > 50000) ? netSalary : grossSalary ;

        System.out.println("finalSalary :" + finalSalary);

        scanner.close();

    }
}
