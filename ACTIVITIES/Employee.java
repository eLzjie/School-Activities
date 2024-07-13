package ACTIVITIES;
//CELINO, ELIAH JOSEPH - 2BSIT-A

import java.util.Scanner;

public class Employee {
    
    Scanner in = new Scanner(System.in);
    
    String first_name;
    String last_name;
    String position;
    int years_worked;
    double salary;
            
    Employee(String first_name, String last_name, String position, int years_worked, double salary){
        
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.years_worked = years_worked;
        this.salary = salary;              
    }
    
    //method to display
    public void display(){
    System.out.println("Name: " + first_name + " " + last_name);
    System.out.println("Position: " + position);
    System.out.println("Years worked in the company: " + years_worked);
    System.out.println("Salary: " + salary + " monthly salary");
    }
   
    
    //method to edit
    public void edit(){
        System.out.println("\n[1] Edit Name");
        System.out.println("[2] Edit Position");
        System.out.println("[3] Edit Years Worked");
        System.out.println("[4] Edit Salary");
        System.out.println("[5] Exit");
        System.out.println("\nSelect Operation: ");
        int edit_operation = in.nextInt();
        in.nextLine();
        
        switch (edit_operation){
            case 1:
                System.out.println("Enter new first name: ");
                String fn = in.nextLine();
                first_name = fn;
                
                System.out.println("Enter new last name: ");
                String ln = in.nextLine();
                last_name = ln;
                System.out.println("\nName Edited!");
                break;
             
            case 2: 
                System.out.println("Enter new Position: ");
                String pos = in.nextLine();
                position = pos;
                System.out.println("\nPosition Edited!");
                break;
                
            case 3: 
                System.out.println("Enter new Years: ");
                int year = in.nextInt();
                years_worked = year;  
                System.out.println("\nYears Edited!");
                break;
                
            case 4: 
                System.out.println("Enter new Salary Amount: ");
                double sal = in.nextDouble();
                salary = sal;   
                System.out.println("\nSalary Edited!");
                break;
                
            default:
                System.out.println("\nInvalid Output");
                break;
        }
    }
    
    
}
