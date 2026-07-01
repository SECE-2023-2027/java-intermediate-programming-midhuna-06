

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Base Salary: ");
        double empSalary = sc.nextDouble();



        sc.nextLine(); 


        System.out.print("Enter Manager Name: ");
        String mgrName = sc.nextLine();

        System.out.print("Enter Manager Base Salary: ");
        double mgrSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Employee emp = new Employee(empName, empSalary);
        Manager mgr = new Manager(mgrName, mgrSalary, bonus);

        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());

        sc.close();
    }
}