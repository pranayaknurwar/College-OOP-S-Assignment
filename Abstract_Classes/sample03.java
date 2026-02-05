package Abstract_Classes;


abstract class Employee {
    abstract double calculateSalary();

    void companyPolicy() {
        System.out.println("Salary credited on 1st of every month");
    }
}

class Developer extends Employee {
    double basic = 50000;

    double calculateSalary() {
        return basic + 10000;
    }
}

class Manager extends Employee {
    double basic = 70000;

    double calculateSalary() {
        return basic + 20000;
    }
}

public class sample03 {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Manager();

        System.out.println("Developer Salary: " + e1.calculateSalary());
        System.out.println("Manager Salary: " + e2.calculateSalary());
    }
}