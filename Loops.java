import java.util.Scanner;

public class EmployeeData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Scanner scanner = new Scanner(System.in);
        

        int numEmployees;
        do {
            System.out.print("Enter the number of employees (minimum 1): ");
            numEmployees = scanner.nextInt();
        } while (numEmployees < 1);

        String[] names = new String[numEmployees];
        String[] roles = new String[numEmployees];
        double[] salaries = new double[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            names[i] = scanner.next();

            System.out.print("Role of  "+ names[i] + ": ");
            roles[i] = scanner.next();

            do {
                System.out.print("Salary (positive value): ");
                salaries[i] = scanner.nextDouble();
            } while (salaries[i] < 0);
        }

        System.out.println("\nEmployee Data:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Role: " + roles[i]);
            System.out.println("Salary: $" + salaries[i]);
            System.out.println();
        }

        scanner.close();

      
    }
}
