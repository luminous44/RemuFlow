

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemuFlow rf = new RemuFlow();
        FulllTimeEmployee ft;
        PartTimeEmployee pt;
        String name;
        int id;
        String category;
        double salary;
        int totalHours;
        double rateOfHour;
        
        while (true) {
            System.out.println("=============================================");
            System.out.println("=================REMU FLOW===================");
            System.out.println("1. Add Employee ");
            System.out.println("2. Remove Employee ");
            System.out.println("3. Get a Emplyoee ");
            System.out.println("0. Exit");
            System.out.println("==============================================");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("1. Add Part Time Employee.");
                    System.out.println("2. Add Full Time Employee.");
                    System.out.println("9. GO To The Main Menu.");
                    int c = sc.nextInt();
                    if (c == 1) {
                        sc.nextLine();
                        System.out.print("Enter Your Name : ");
                        name = sc.nextLine();
                        System.out.print("Enter Id : ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Salary : ");
                        salary = sc.nextDouble();
                        ft = new FulllTimeEmployee(name, id, "Part Time", salary);
                        rf.addEmployee(ft);
                    } else if (c == 2) {
                        sc.nextLine();
                        System.out.print("Enter Your Name : ");
                        name = sc.nextLine();
                        System.out.print("Enter Id : ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Working Hour : ");
                        totalHours = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Rate of Hour : ");
                        rateOfHour = sc.nextDouble();
                        pt = new PartTimeEmployee(name, id, "Full Time", totalHours, totalHours);
                        rf.addEmployee(pt);
                    } else {
                        break;
                    }
                    break;
                case 2:
                    System.out.print("Enter Id : ");
                    id = sc.nextInt();
                    rf.removeEmployee(id);
                    break;
                case 3:
                    rf.displayEmployee();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid Choice !!!.");
                
            }
            
        }
    }
    
}
