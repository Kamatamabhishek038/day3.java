import java.util.Scanner;

abstract class Employee {
    private String name;
    private int empId;
    private double salary;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public abstract void calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Total Salary  : " + salary);
    }
}

class FullTimeEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    public FullTimeEmployee(String name, int empId, double baseSalary, double bonus) {
        super(name, empId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        setSalary(baseSalary + bonus);
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double hourlyRate) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        setSalary(hoursWorked * hourlyRate);
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Full-Time Employee Details ---");
        System.out.print("Enter Name: ");
        String ftName = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int ftId = sc.nextInt();
        System.out.print("Enter Base Salary: ");
        double baseSalary = sc.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("\n--- Enter Part-Time Employee Details ---");
        System.out.print("Enter Name: ");
        String ptName = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int ptId = sc.nextInt();
        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();
        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();

        Employee emp1 = new FullTimeEmployee(ftName, ftId, baseSalary, bonus);
        Employee emp2 = new PartTimeEmployee(ptName, ptId, hours, rate);

        System.out.println("\n=== Full-Time Employee Salary Details ===");
        emp1.calculateSalary();
        emp1.displayDetails();

        System.out.println("\n=== Part-Time Employee Salary Details ===");
        emp2.calculateSalary();
        emp2.displayDetails();

        sc.close();
    }
}
