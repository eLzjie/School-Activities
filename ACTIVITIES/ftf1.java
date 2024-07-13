package ACTIVITIES;
//CELINO, ELIAH JOSEPH - 2BSIT-A

import java.util.ArrayList;
import java.util.Scanner;

public class ftf1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        employees.add(new Employee("Lara", "Croft", "Secretary", 6, 60000));
        employees.add(new Employee("Nathan ", "Drake", "Researcher", 3, 50000));
        employees.add(new Employee("Arthur ", "Morgan", "Accountant", 4, 65000));
        employees.add(new Employee("Ezio ", "Auditore", "CEO", 12, 120000));
        employees.add(new Employee("Gordon ", "Freeman", "Scientist", 8, 95000));

        int operation = 0;
        
        while(operation != 5){
            printMenu();
            operation = in.nextInt();
            in.nextLine();
            
            switch (operation){
                case 1: //display all employees
                    for(Employee emp : employees){
                        emp.display();
                        System.out.println("\n");
                        }
                    break;

                case 2: //display single employee
                    System.out.println("\nAvailable Employees");
                    for (Employee emp : employees) {
                        System.out.println(emp.first_name);
                    }

                    System.out.println("\nSelect an employee: ");
                    String choose = in.nextLine().trim();

                    boolean found = false; 
                    
                    for (Employee emp : employees) {
                        if (choose.equalsIgnoreCase(emp.first_name.trim())) {
                            emp.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) { 
                        System.out.println("Employee not found!");
                    }

                    break;

                case 3: //edit employees
                    for(Employee emp : employees){
                        System.out.println(emp.first_name);
                    }
                    
                    System.out.println("\n Select an employee to edit: ");
                    String c = in.nextLine().trim();

                    for(Employee emp : employees){
                        if(c.equalsIgnoreCase(emp.first_name.trim())){
                            emp.edit();
                            break;
                        } else continue;
                     }

                    break;

                case 4: //add employee
                      System.out.println("\n** Adding a New Employee **");
                      System.out.println("Enter First Name: ");
                      String firstName = in.nextLine().trim();
                      System.out.println("Enter Last Name: ");
                      String lastName = in.nextLine().trim();
                      System.out.println("Enter Position: ");
                      String position = in.nextLine().trim();
                      System.out.println("Enter Years Worked: ");
                      int yearsWorked = in.nextInt();
                      System.out.println("Enter Salary: ");
                      double salary = in.nextDouble();

                      employees.add(new Employee(firstName, lastName, position, yearsWorked, salary));
                      System.out.println("\nEmployee added successfully!");
                      break;

                case 5: //exit 
                    System.exit(0);
                    break;


                default:
                    System.out.println("Invalid Input");
                    break;

            }
        }
         
    }

    private static void printMenu() {
        System.out.println("\n\n=====JAVA COMPANY=====\n");
        System.out.println("[1] View All Employees");
        System.out.println("[2] View Single Employee");
        System.out.println("[3] Edit Employee");
        System.out.println("[4] Add Employee");
        System.out.println("[5] Exit");
        System.out.print("\nSelect Operation: ");
    }
    
    
    
}
