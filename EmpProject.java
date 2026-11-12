abstract class Employee {
    private String name;
    private int empId;
    private double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, int empId, double baseSalary, double bonus) {
        super(name, empId, baseSalary);
        this.bonus = bonus;
    }

    void calculateSalary() {
        setSalary(getSalary() + bonus);
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int empId, int hours, double rate) {
        super(name, empId, 0);
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        setSalary(hours * rate);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Rahul", 101, 40000, 5000);
        Employee e2 = new PartTimeEmployee("Ananya", 102, 50, 300);

        e1.calculateSalary();
        e2.calculateSalary();

        e1.showInfo();
        e2.showInfo();
    }
}